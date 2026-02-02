def summ(li:list):
    s=0
    for i in range(len(li)):
        s=s+li[i]
    return s
lii=list(map(int,input().split()))
print(summ(lii))