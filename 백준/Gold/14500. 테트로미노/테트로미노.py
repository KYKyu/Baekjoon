import sys
N, M = map(int, sys.stdin.readline().split())

board = [list(map(int, input().split())) for _ in range(N)]
check = [[0] * M for _ in range(N)]
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
result = 0
max_val = max(map(max, board))

def dfs(x, y, cnt, total):
    global result
    if result >= total + max_val*(4-cnt):
        return
    if cnt == 4:
        result = max(result, total)
        return
    else:
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and check[nx][ny] == 0:
                if cnt == 2:
                    check[nx][ny] = 1
                    dfs(x, y, cnt+1, total+board[nx][ny])
                    check[nx][ny] = 0
                check[nx][ny] = 1
                dfs(nx, ny, cnt+1, total+board[nx][ny])
                check[nx][ny] = 0

for i in range(N):
    for j in range(M):
        check[i][j] = 1
        dfs(i, j, 1, board[i][j])
        check[i][j] = 0

print(result)