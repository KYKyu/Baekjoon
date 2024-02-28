a, b = map(int, input().split())

if a > b:
    temp = a
    a = b
    b = temp

left = a // 4
if a % 4 == 0:
    left -= 1

right = b // 4
if b % 4 == 0:
    right -= 1

result = right - left
com = a + 4 * result

if com - b > 0:
    result += com - b
else:
    result += b - com

print(result)