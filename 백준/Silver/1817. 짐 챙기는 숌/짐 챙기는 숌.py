N, M = map(int, input().split())

if N == 0:
    print(0)
    exit()

books = list(map(int, input().split()))
count = 1

box = M
for i in range(N):
    box -= books[i]
    if box < 0:
        count += 1
        box = M - books[i]

print(count)