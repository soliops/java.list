from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from asyncio.tasks import sleep
from selenium.webdriver.common.by import By

#자동로그인, 자동페이지이동, 자동검색...
bw = webdriver.Chrome(ChromeDriverManager().install())
bw.get("https://www.naver.com")
#자동으로 크롬 브라우저 이동
#https://search.naver.com/search.naver?query=
#https://search.daum.net/search?q=
#https://search.nate.com/search?q=
#

# bw.find_element(by, value)