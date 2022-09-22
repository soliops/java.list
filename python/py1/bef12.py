from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from asyncio import sleep

bw = webdriver.Chrome(ChromeDriverManager().install())
bw.get("https://www.naver.com")

# bw.find_element(by, value)