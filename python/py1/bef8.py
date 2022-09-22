from bs4 import BeautifulSoup
from requests import *
from re import *
from random import *
from csv import * # csv파일로 변환 할 수 있는 모듈

filenm = "kospi.csv"
f=open(filenm,"w",encoding="EUC-KR",newline="") 
#csv 파일 저장시 euc-kr로 적용시 한글깨짐 방지
#newline : csv 파일 등록시 데이터가 그 다음줄에 바로 이어서 입력되도록 함
#해당 속성을 입력시 띄워쓰기 기능을 없앰
writer = writer(f)

url = "https://finance.naver.com/sise/sise_market_sum.naver"
web = get(url)
web.raise_for_status()
html = BeautifulSoup(web.text,"lxml")
# print(html)
table = html.find("table",attrs={"class":"type_2"})
tbody = table.find("tbody")
tr = tbody.find_all("tr")
# print(tbody)
# print(tr)
for data in tr:
    td=data.find_all("td")
    # print(td)
    data = [text.get_text() for text in td]
    if len(data)<=1:
        continue
    else:
        company = data[1].strip().replace(",","")
        price =data[2].strip().replace(",","")
        book = data[5].strip().replace(",","")
        # print(data[3].strip().replace(",",""))
        print(company,price,book)
        # writerow : 엑셀기준에, 입력시켜서 다음 칸으로 적용되는 형태
        rowdata = [company,price,book] #배열로 생성해야만 csv에서 하나의 행,열로 인식됨
        writer.writerow(rowdata)        