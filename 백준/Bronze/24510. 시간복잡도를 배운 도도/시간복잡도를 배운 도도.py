c = int(input())

max_value = 0
for i in range(c):
    s = input()
    cnt = 0
    cnt += s.count("for")
    cnt += s.count("while")
    
    max_value = max(max_value, cnt)
    
print(max_value)