import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

V = int(input())
graph = [[] for _ in range(V+1)]
visited = [-1] * (V + 1)

for _ in range(V):
    line = list(map(int, input().split()))
    for i in range(1, len(line) - 2, 2):
        graph[line[0]].append((line[i], line[i+1]))

def dfs(start, distance):
    for next, next_d in graph[start]:
        if visited[next] == -1:
            visited[next] = distance + next_d
            dfs(next, distance + next_d)

visited[1] = 0
dfs(1, 0)

furthestNode = visited.index(max(visited))
visited = [-1] * (V + 1)
visited[furthestNode] = 0
dfs(furthestNode, 0)

print(max(visited))