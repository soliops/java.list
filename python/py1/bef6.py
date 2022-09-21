from bs4 import BeautifulSoup 
from requests import *

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