from bs4 import BeautifulSoup #파싱과 파서를 하기 위해서 모듈사용
from os import * #운영체제가 기본으로 제공하는 모듈
# from os.path import os

# htmlcode = BeautifulSoup("<div><span>테스트</span></div>")
# soup = BeautifulSoup("<span><b><i>테스트</i></span>")
# print(soup.prettify())


directory = "html"
print(getcwd()) #현재 경로
mkdir(directory) #mkdir(리눅스 명령어) : 디렉토리 생성