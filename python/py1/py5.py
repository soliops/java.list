from random import *
#파이썬으로 다음과 같이 출력되는 코드를 작성하시오.
#2*1~3*9까지 출력
#[힌트] range 및 더블 for in 입니다.
'''
for a in range(2,4):
    for b in range(1,10):
        print(str(a)+"*"+str(b)+"="+str(a*b))

data = [2,6,7,3,1]
data = [i+5 for i in data] 
#배열값에 기존 배열값을 적용하여 산술식으로 배열을 새롭게 구성함
print(data)
'''
#다양한 형태로 배열값을 반복문을 통해 변화시킬 수 있습니다.
person = ["kim","park","lee"]
person = [aa.upper() for aa in person]
print(person)
person = ["#"+aa.lower() for aa in person]
print(person)

tel = ["010-1234-5678", "01022233445" ,"010.2234.4567"]
tel = [bb.replace("-","").replace(".","")  for bb in tel]
print(tel)