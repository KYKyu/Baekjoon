list = []
sum = 0
go = True
for i in range(9):
    list.append(int(input()))

for i in range(9):
    sum += list[i]

for i in range(8):
    n = sum - list[i]
    for j in range(i + 1, 9):
        if n - list[j] == 100:
            list[i] = list[j] = 0
            go = False
            break
    if go == False:
        break

list.sort()

for i in range(9):
    if list[i] != 0:
        print(list[i])