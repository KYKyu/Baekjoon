import sys
arr = []
N = int(sys.stdin.readline())

for i in range(N):
    arr.append(int(sys.stdin.readline()))

if arr[1] - arr[0] == arr[2] - arr[1]:
    result = arr[N-1] + arr[1] - arr[0]
else:
    result = arr[N-1] * (arr[1] / arr[0])

print(int(result))