num1=list(map(int,input().split()))
num2=list(map(int,input().split()))
l=[]
for i in range(len(num1)):
    if(num1[i]%2!=0):
        l.append(num1[i])

for i in range(len(num2)):
    if(num2[i]%2==0):
        l.append(num2[i])       
print(l)