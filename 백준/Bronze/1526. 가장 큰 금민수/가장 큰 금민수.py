N = int(input())

while True:
    flag = True
    for c in str(N):
        if not(c == '4' or c == '7'):
            flag = False
            N -= 1
            break
    if flag == True:
        print(N)
        break    