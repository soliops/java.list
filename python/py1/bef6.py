from bs4 import BeautifulSoup 
from requests import *
#해당 사이트에 접속하여 Devtool로 볼 경우 데이터가 확인이 되지만
#실제 크롤링 후 스크래핑시 데이터가 확인이 안될 경우 AJAX 및 JavaScript로 
#직접 태그가 생성되도록 제작되었음. 이럴경우 스크래핑하기가 어려워짐
url="https://www.koreabaseball.com/TeamRank/TeamRank.aspx"
result = get(url)
# print(result.raise_for_status())

html = BeautifulSoup(result.text,"lxml")
# baseball = html.find("table",attrs={"id":"tblTeamRank"})
baseball = html.find("div",attrs={"id":"cphContents_cphContents_cphContents_udpRecord"})
team = baseball.find("tbody")
tr = team.find_all("tr")
# print(tr[0])
w=0
for i in tr:
    td = tr[w].find_all("td")
    print(td[1].get_text())
    w+=1
# print(baseball.get_text())
# print(html)