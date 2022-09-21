from bs4 import BeautifulSoup 
from requests import *

url = "https://www.nate.com/"
res = get(url)
res.raise_for_status()

result = BeautifulSoup(res.text,"lxml")
#태그 이름을 적용하여 태그 안에 있는 텍스트를 가져올 수 있음
#단, 중복된 태그가 있을 경우 제일 먼저 읽어오는 라인만 처리가 됨

# print(result.title) #title 태그 
# print(result.title.get_text())

#find 해당 단어를 찾습니다. attrs(attribute 속성명)
rank = result.find("div",attrs={"class":"isKeyword"})
print(result.h4.get_text())
#div class= "isKeyword"를 찾아서 실시간 이슈 키워드를 가져옴
print(rank.h4.get_text())
print(rank.li)

#rank에만 속하는 태그 중 span이라는 태그와 해당 클래스명 검토
# ranknum = rank.find("span",attrs={"class":"num_rank"})
# print(len(rank.li)) #반복되는 태그의 갯수를 확인함

ranknum = rank.find_all("span",attrs={"class":"num_rank"})
ranksubject = rank.find_all("span",attrs={"class":"txt_rank"})
w=0
for bb in ranknum:
    print(bb.get_text())
    print(ranksubject[w].get_text())
    w+=1
# for cc in ranksubject:
#     print(cc.get_text())
'''   
print(ranknum.get_text())
print(ranksubject.get_text())
'''
