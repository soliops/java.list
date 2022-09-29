#파이썬 함수
def aaa(a,b):
    print("상품명 : {}, 가격 : {}".format(a,b) )
    print("함수출력")
    
aaa("가방",600)

import defs as df
result = df.ccc()
print(result)
df.ddd(10,20)

#----class-----------#
class cdatas:
    money = 5000 #전역변수
    def aaa(self):
        money =100 #지역변수
        # global money
        #money를 그냥 return 에러 aaa 메소드에서 
        #money 변수를 찾음
        # return self.money #전역변수값
        return money #지역변수값
    
c1 = cdatas()
#print(c1.money) 
#클래스 안에 여러개의 전역변수가 있으면,
# 해당 변수값을 바로 가져올 수 있음
result2 = c1.aaa()
print(c1.money)

######외부 클래스 로드
out = df.product()
out.add1(50000)
