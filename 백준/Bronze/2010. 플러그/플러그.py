import sys
input = sys.stdin.readline

N = int(input())
count = 0
count += int(input())
for i in range(N - 1):
    count += int(input()) - 1

print(count)