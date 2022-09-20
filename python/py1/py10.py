#BeautifulSoup4에 대한 bs4를 사용하기 위해서는 라이브러리를
#pom.xml처럼 파이썬에 등록 시켜 주셔야 합니다.
#설치형태 무조건 cmd로 설치
'''
1. 파이썬이 설치된 디렉토리 경로를 확인
2. cd 이용해서 해당 디렉토리 이동
3. cd Scripts 디렉토리 안으로 이동
4. pip install beautifulsoup4
단, 파이썬을 새로 설치하면 다시 설치해야 한다.
'''
#urlopen 함수 : 원하는 웹페이지 주소를 접속 및 연결 
from urllib.request import urlopen
#BeautifulSoup 함수 : 접속한 웹페이지에 대한 모든 문서 파일을 파서하는 역할을 하게 됩니다.
from bs4 import BeautifulSoup
from idlelib.iomenu import encoding

#urlopen(웹페이지 주소)
html = urlopen("https://lookple.com")
#해당 url parser 작업을 함
object = BeautifulSoup(html,"html.parser")

#해당 parser 문자를 html로 저장함
files = open("1.html","w",encoding="utf-8")
print(object,file=files)
files.close()
#뉴스 긁어오기
html2 = urlopen("https://n.news.naver.com/mnews/article/001/0013448848?sid=101")
object2 = BeautifulSoup(html2,"html.parser")
files2 = open("news.html","w",encoding="utf-8")
print(object2,file=files2)
files2.close()
