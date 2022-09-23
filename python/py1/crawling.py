from tkinter import *
from _functools import partial

root = Tk()
root.title("펜션 쿠팡 크롤링")
root.geometry("640x150") # 가로 * 세로

msg = Label(root, text="옥션 크롤링 주소 형식")
msg2 = Label(root, text="예시)https://browse.auction.co.kr/search?keyword=펜션예약")
#http://search.tmon.co.kr/search/?keyword=가평펜션&thr=hs

msg.pack()
msg2.pack()
##입력파트
src = Text(root,width=50,height=3,padx=5)#크롤링 주소
src.insert(END, "") #사용자가 입력한 주소값을 전달 받기위한 코드
src.place(x=50,y=50) #오브젝트를 원하는 위치에 오브젝트를 설정할수 있음
# src.pack(side="left")

#from 형태의 import 방식
from crawling_def import * 
def textload():
  #사용자가 입력한 값을 변수로 변환
    url = src.get("1.0",END)
    #crawling_def.py 함수로 값을 전달
    crawlings(url)
btn = Button(root, width=10,height=2,text="크롤링 시작",command=textload)
# partial (함수명, 인자값)
# btn = Button(root, width=10,height=2,text="크롤링 시작",command=partial(crawlings,"홍길동"))

# lambda 방식
# btn = Button(root, width=10,height=2,text="크롤링 시작",command=lambda:crawlings(url))

#일반적인 import 방식
# import crawling_def as craw 
# btn = Button(root, width=10,height=2,text="크롤링 시작",command=craw.crawlings)

# btn.pack(side="right")
btn.place(x=450,y=50)
root.resizable(False, False)
root.mainloop() #무조건 제일 아래에 생성