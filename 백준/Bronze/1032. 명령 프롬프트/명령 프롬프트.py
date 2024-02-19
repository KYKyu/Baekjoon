N = int(input())

str = []
for i in range(N):
    str.append(input())

len = len(str[0])

result = []

for i in range(N):
    for j in range(len):
        if i == 0:
            result.append(str[i][j])
            continue
        if result[j] != str[i][j]:
            result[j] = "?"

for i in range(len):
    print(result[i], end="")
        
            