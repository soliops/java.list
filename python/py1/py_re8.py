#크롤링 & 스크래핑

from bs4 import BeautifulSoup
from requests import *

url = "http://opete95.cafe24.com/site.html"
call = get(url)
print(call)
call.raise_for_status()

htmlcode = BeautifulSoup(call.text,"lxml")
code = htmlcode.find("div",attrs={"class":"divcss"})
code2 = code.find("ul",attrs={"class","ulclass"})
code3 = code2.find_all("li")
array = []
f=0
for txt in code3:
    array+=[txt.get_text()]
print(array)