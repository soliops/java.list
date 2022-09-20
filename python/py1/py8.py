#편의성 및 함수이동 방법
#0001 0002 0003

for number in range(1,31):
    print("대기번호 : {}".format(str(number).zfill(3)))
#zfill(숫자 자리수) : 자동으로 숫자 자리수를 맞추는 함수 입니다.

#3자리 마다 ,로 출력
money = 10000000000
money2 = 50000
print("{0:,}원 입니다. 잔돈은 {1:,}입니다.".format(money,money2))

#함수이동
def abc():
    bbb()
    
def bbb():
    print("함수 이동으로 값을 출력시킴")
    
abc()