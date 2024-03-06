N = int(input())

sum = 0
for i in range(0, N * N, N + 1):
    sum += i

print(sum)