import sys

S = set([])
allS = set([f"{i}" for i in range(1, 21)])
def add(x):
    if not (x in S):
        S.add(x)
def remove(x):
    if x in S:
        S.remove(x)
def check(x):
    if x in S:
        print(1)
    else:
        print(0)
def toggle(x):
    if x in S:
        S.remove(x)
    else:
        S.add(x)
def all():
    S.update(allS)
def empty():
    S.clear()

N = int(sys.stdin.readline())
for i in range(N):
    com = sys.stdin.readline().split()
    if com[0] == "add":
        add(com[1])
    elif com[0] == "remove":
        remove(com[1])
    elif com[0] == "check":
        check(com[1])
    elif com[0] == "toggle":
        toggle(com[1])
    elif com[0] == "all":
        all()
    elif com[0] == "empty":
        empty()