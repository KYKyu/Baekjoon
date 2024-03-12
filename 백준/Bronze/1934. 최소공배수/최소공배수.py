def gcm(a, b):
    if b == 0:
        return a
    return gcm(b, a % b)

def lcm(a, b):
    return a * b / gcm(a, b)

T = int(input())
for i in range(T):
    a, b = map(int, input().split())
    print(int(lcm(a, b)))