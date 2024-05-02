N = int(input())
strNum = ""
for i in range(1, N+1):
    strNum += str(i)

print(strNum.find(str(N)) + 1)