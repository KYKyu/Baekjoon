import sys

N = int(sys.stdin.readline())

arr = [[0 for _ in range(5)] for _ in range(N)]

for i in range(N):
    arr[i] = list(map(int, input().split(" ")))

student = [0 for _ in range(N)]

for i in range(N):
    for j in range(N):
        if (i == j):
            continue
        for k in range(5):
            if arr[i][k] == arr[j][k]:
                student[i] += 1
                break

result = 1
max = student[0]
for i in range(1, N):
    if max < student[i]:
        result = i + 1
        max = student[i]
print(result)