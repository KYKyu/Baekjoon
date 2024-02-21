N = int(input())

minus = 1
count = 0
while N > 0:
    if N < minus:
        minus = 1
        continue
    N -= minus
    minus += 1
    count += 1

print(count)