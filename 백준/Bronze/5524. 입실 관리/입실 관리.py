N = int(input())

for i in range(N):
    result = []
    str = input()
    lenStr = len(str)
    for j in range(lenStr):
        if ord(str[j]) >= 65 and ord(str[j]) <= 90:
            result.append(chr(ord(str[j]) + 32))
        else:
            result.append(str[j])
    for j in range(lenStr):
        print(result[j], end="")
    print()