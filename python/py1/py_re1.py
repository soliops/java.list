#복습1 (python)

#기본 무조건 배열
#파이썬 웹 서버구축 = flask
#Java 에디터랑 python 에디터를 구분하셔서 사용

#개발 도구 - 파이썬 설치
#그 외에 패키지 - pip install 패키지명
#(cmd -> python 설치 경로 -> pip list로 설치된 패키지 검색가능)
#패키지 삭제 - pip uninstall 패키지명
#--------------------------------#
from random import *
#파이썬 변수에 자료형 없음(모든 형태 Object)
abc = ["a","b","c",10]
#for in (배열 데이터), while(일반 반복문)
print("{}".format(abc[0]))

#import random as rd
#aaa =rd.randint(4,10)
bbb = randint(5,10)
print(bbb)

#무자열 형태
msg = '''
[이용약관]
테스트입니다.
'''
print(msg)

#문자열을 셋팅하는 형태
hp = "010-1234-5678"
# print(hp[9])
# print(hp[0:3]) #0~2까지 문자열을 가져옴
print(hp[:8]) #문자열 처음부터 ~7까지 문자열을 가져옴
print(hp[9:]) #해당 문자열부터 ~ 무조건 끝까지 문자열을 가져옴
print(len(hp)) #문자열 대한 갯수
print(hp.replace("-",""))
print(hp.find("1234"))
print(hp.find("<span>"))

#findall 무조건 변수로 받아서 배열로 처리
import re as r #re 패키지를 가져와서 사용
array = r.findall("1",hp)
print(array)

#변수값 출력 (v3.6) 
abox = 3000
cbox =5000
total = f"{abox}와 {cbox} 부분 금액 입니다."
print(total)

#경로 출력 \\