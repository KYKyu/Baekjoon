import sys

D, H, W = map(int, sys.stdin.readline().split())
x = D / ((H ** 2 + W ** 2) ** 0.5)

print(int(x * H), int(x * W))