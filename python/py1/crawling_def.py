#messagebox는 alert 이랑 동일한 메세지 출력 입니다.
from tkinter.messagebox import *
import requests #통신 api json 변화 사용해서 웹사이트 접속하는 형태
from bs4 import BeautifulSoup
from re import *
from sqlite3 import *
from dbconnect import * #db접속정보
from datetime import *

def crawlings(data):
    #showinfo = alert
    # print(len(data)) 아무것도 입력 안해도 1이 뜬다.
    
    if len(data)==1 or len(data)<10:
        showinfo("경고","크롤링할 url 주소를 입력하셔야 합니다.")
    else:
        #try,except,finally 문제 발생시 예외처리하는 형태
        try:
            # today = datetime.now().replace(microsecond=0)
        # url = "https://www.naver.com"
        # url = data
        # print(type(url))
            url = "{}".format(data) #문자열로 변환해야만 requests를 사용할 수 있음
            # print(url)
            check = requests.get(url.strip(),headers={'User-Agent': 'Mozilla/5.1'}) #\n \ 빈공간 제거
            ck = check.raise_for_status() #NoneType (통신type)
            # print(type(str(ck)))
            if str(ck)=="None":
                html = BeautifulSoup(check.text,"lxml")
                div = html.find("div",attrs={"module-design-id":"17"})
                # print(div)
                div2 = div.find_all("div",attrs={"class":"section--itemcard"})
                # print(div2)
                # titles = div2[1].find("span",attrs={"class":"text--title"})
                # money=div2[0].find("strong",attrs={"class":"text--price_seller"})
                # print(money)
                con = connect.cursor()
                #DB 접속 정보를 로드
                for z in div2:
                    titles = z.find("span",attrs={"class":"text--title"})
                    money = z.find("strong",attrs={"class":"text--price_seller"})     
                    money = sub(",","",money.text) #sub : from re import * 선언 필요      
                    # print(titles.text, money)
                    
                    #DB저장
                    #등록시간
                    #DB에서 날짜 입력을 저장 시키기 위해서 strftime: 문자열 형태의 시간으로 변경
                    now_date = datetime.today().strftime('%Y-%m-%d %H:%M:%S')
                    sql ="insert into pension values ('0','"+titles.text+"','"+money+"','"+now_date+"')"
                    con.execute(sql)
                    connect.commit()
                        
                showinfo("성공","정상적으로 모든 데이터를 스크래핑 완료 하였습니다.")  
        except:
            showinfo("실패","크롤링 url주소를 다시 확인하세요")        