from urllib import *
from requests import *

def download(url):
    with open("tmon.html","wb") as file:
        response = get(url)
        file.write(response.content)

url = "http://search.tmon.co.kr/search/?keyword=가평펜션&thr=hs"
download(url)

