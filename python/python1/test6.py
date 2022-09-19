# %d(숫자), %s(문자, 숫자)
print("포인트 %d가 있습니다." %6000)
print("%s님 환영합니다." %"홍길동")
print("%s님 포인트 %s가 있습니다." %("홍길동","5000"))

# {} 형태의 배열형태의 구성입니다.
print("{}님 회원등급은 {}입니다.".format("유관순","실버회원"))
print("입급하신 총 금액은 {}입니다.".format(55000))
print("고객님 아이디는 {1}이며, 가입하신 이름은 {0}입니다.".format("세종대왕","kings"))

print("계산하신 상품은 {product} 이며, 총 결제하실 금액 {money} 입니다.".format(product="핸드폰",money=650000))
print("계산하신 상품은 {product[0]} 이며, 총 결제하실 금액 {money} 입니다.".format(product=("핸드폰","컴퓨터"),money=650000))

#3.6v 이상
color="red"
car= "제네시스"
print(f"고객님의 자동차 종류는 {car} 이며,\n {color} 색상 입니다.")
# \ 하나만 입력할 경우는 \n처럼 특수 언어를 사용하는 형태로 인식함. 윈도우 서버에서
#로컬로 파일을 로드할 경우 \\두개 사용하셔야 합니다.
print("c:\\user\\window\\programmer")

#응용문제 
####패스워드 자동생성 프로그램 ####
from random import *
word1 = "abcdefghijklmnopqrstuvwxyz"
lens = len(word1)
print(len(word1))
pw1 = int(random()*lens) #0~25
pw2 = int(random()*lens) #0~25
pw3 = int(random()*lens) #0~25
pw4 = int(random()*lens) #0~25
password = word1[pw1] + word1[pw2] + word1[pw3] + word1[pw4]
print(password)