N, K = map(int, input().split())

list = input().split(",")

for i in range(K):
    for j in range(N-i-1):
        list[j] = int(list[j+1]) - int(list[j])

for i in range(N-K-1):
    print(list[i], end=",")
print(list[N-K-1])