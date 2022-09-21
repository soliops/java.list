from bs4 import BeautifulSoup 
from os import * 
from requests import * #requests : 해당 url 접속 정보를 확인
url = get("http://www.naver.com")
#java에서 ajax할때 썼었음
print("응답코드 :",url.status_code)
#200 : 정상

if url.status_code == codes.ok: #codes.ok == 200
    print(url.text)
    print("웹사이트 정상적인 페이지입니다.")
else:
    print("해당 웹사이트는 보안 또는 코드에 문제가 있습니다.")
