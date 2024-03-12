import sys
import math

N, S = map(int, sys.stdin.readline().split())
p = list(map(int, sys.stdin.readline().split()))

arr = []
for i in range(N):
    arr.append(abs(p[i] - S))

result = arr[0]
for i in range(1, N):
    result = math.gcd(result, arr[i])

print(result)