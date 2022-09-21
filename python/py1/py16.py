#특정 예외처리 구성

try:
    print("두개의 값을 입력하세요")
    number1 = int(input("첫번째 숫자를 입력하세요."))
    number2 = int(input("두번째 숫자를 입력하세요."))
    if number1 < number2 :
        data = []
        data.append(number1)
        data.append(number2)
    else:
        raise OverflowError
    #raise : 해당 이름을 가진 except을 선정하여 실행되도록 함
    print(data)
    
#OverflowError
except OverflowError:
    print("두번째 숫자 입력시 첫번째 숫자보다 크게 입력하십시오")

except ValueError:
    print("숫자만 입력하세요")
finally:
    print("모든 프로세서가 종료 됩니다.")    