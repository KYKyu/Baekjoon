N = int(input())

for i in range(N):
    for j in range(N):
        if i % 2 == 0:
            print("* ", end="")
        elif i % 2 == 1:
            print(" *", end="")
    print()