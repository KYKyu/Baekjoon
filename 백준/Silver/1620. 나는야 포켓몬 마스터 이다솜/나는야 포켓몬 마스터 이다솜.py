import sys

N, M = map(int, sys.stdin.readline().split())
dogam = {}
for i in range(1, N+1):
    c = sys.stdin.readline().rstrip()
    dogam[i] = c
    dogam[c] = i

for i in range(M):
    n = input()
    if n.isdigit():
        print(dogam[int(n)])
    else:
        print(dogam[n])