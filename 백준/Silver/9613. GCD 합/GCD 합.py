import sys
import math

T = int(input())

for _ in range(T):
    arr = list(map(int, sys.stdin.readline().split()))
    result = 0
    N = arr[0]
    for i in range(1, N):
        for j in range(i + 1, N + 1):
            result += math.gcd(arr[i], arr[j])
    print(result)