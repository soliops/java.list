a = 15
if a == 5 : #if문 : = {}
    print("숫자 5 입니다.")
elif a == 10 : #elif문 = else if
    print("숫자 10입니다.")
else : 
    print("숫자 15입니다.")
#input = Scanner와 같은 기능
'''
b = input("좋아하는 숫자를 입력하세요?")
c = int(b) % 2  
#input에 입력된 값은 모두 str로 인식을 하므로 
#int로 변환해야 산술식이 적용됨
if c==0 : print("해당 숫자는 짝수를 입력하셨습니다.")
else : print("해당 숫자는 홀수를 입력하셨습니다.")

person = input("고객아이디를 입력하세요?")
if person == "hong" or person == "kim":
    print("일반 회원 입니다.")
elif person =="park" :
    print("실버 회원 입니다.")
else :
    print("가입되지 않은 회원 입니다.") 
'''
#사용자가 입력한 값을 숫자로 자료형 변환을 할 경우
number = int( input("총 입금하실 금액은?"))
if number < 10000 :
    print("입금은 최소 10000원 이상 입력을 하셔야 합니다.")
# elif number >= 10000 and number <= 5000000 :
elif 10000<= number <= 5000000 :
    print("정상적으로 입금이 완료 되었습니다.")
else : 
    print("한번에 입금 가능한 금액은 5000000원 까지 입니다.")