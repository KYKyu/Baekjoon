N = int(input())
students = list(map(int, input().split()))

seq = []

for i in range(N):
    seq.insert(i-students[i], i+1)

for i in range(N):
    print(seq[i], end=" ")