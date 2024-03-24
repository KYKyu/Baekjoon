import sys

A, B = sys.stdin.readline().split()

lenA = len(A)
lenB = len(B)

sum = 0
result = 0
for i in range(lenA):
    sum += int(A[i])

for i in range(lenB):
    result += sum * int(B[i])

print(result)