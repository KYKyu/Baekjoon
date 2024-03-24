import sys

A, B = sys.stdin.readline().split()

lenA = len(A)
lenB = len(B)

sumA = 0
for i in range(lenA):
    sumA += int(A[i])

sumB = 0
for i in range(lenB):
    sumB += int(B[i])

print(sumA * sumB)