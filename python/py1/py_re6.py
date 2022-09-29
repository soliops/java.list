#예외처리
from _ast import Try
try:
    a="123"
    b=int(a)
    print(b)

except:
    print("에러발생")
finally:
    print("프로그램 종료")
    # 최종적으로 종료