# +.-./.*
# 산술연산 기호 및 결과값 출력
# print(10%3) #나머지 구하는 연산 기호
# print(10/3) #소수점도 출력되는 나누기 형태
# print(10//3) # // 소수점 출력없이 정수로 출력
# print(2*3) #곱하기
# print(2**3) # ** 제곱근 => 2^3 = 2*2*2

#부등호 <, >, <=, >=, ==, !=, not 
# print(10+30 == 50)  
# print( 10 != 20) # true
# print(not(10!=20)) # false 부정의 부정을 사용
'''
print((10 > 5 ) and (10<5)) #True
print((10 > 5 ) and (4<5)) #False
print((10 > 5 ) & (4<5)) #and == &
print((10 > 5 ) or (4>5)) # True
print((10 < 5 ) | (4>5)) # False or == |
'''
#여러개를 한꺼번에 비교하여 전체가 모두 맞을 경우 True
# 그 외에는 False가 출력 됩니다.
# print(10>20>30) #False
# print(3>2>1) #True

#괄호 부분에 포함한 산술연산부터 실행
print(10+20*10)
print((10+20)*10)
num = (10 + 20) * 10
print(num)

#증가, 감소, 곱하기, 나누기 (+=,-+,*=,/=)
jum = 5
jum += 4
print(jum)



