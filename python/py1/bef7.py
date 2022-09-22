from bs4 import BeautifulSoup
from requests import *
from re import *
from random import *
#정규식


#크롤링 사용되는 파라미터 page view 번호
pno_data = ["69382","70931","69388","69389"]

#해당 pageview 배열을 순차적으로 접근 할 수 있도록 반복문 실행
for pno in pno_data:
    # print(pno)
    #해당 파라미터에 배열값을 입력시켜 배열이 끝날 때까지 크롤링함
    url="https://pages.coupang.com/p/"+pno+"?from=home_C2&traid=home_C2&trcid=11186418"
    html = get(url)
    html.raise_for_status()
    code = BeautifulSoup(html.text,"lxml")
    # print(code)
    product = code.find("ul",attrs={"id":"products"})
    lis = product.find_all("li")
    
    for no in lis:
        product_name = no.find("div",attrs={"class":"name"}) #상품명
        product_money = no.find("strong",attrs={"class":"price-value"}) #상품ㅅㅏ격
        product_count = no.find("span",attrs={"class":"rating-total-count"})
        product_img = no.find("img")
        pd_img = "https:"+product_img["lazy-load"]
        #attrs에 해당 속성을 가져오지 못함
        #정상적인 속성값이 아닌 임의 속성값이므로 로드를 하지 못함
        #임의생성된 속성값은 [] 배열형태로 로드하면 쉽게 가져올 수 있음
        # print("https:"+product_img["lazy-load"])
        
        #해당 상품 이미지를 모두 로드 하였음
        # code = randrange(1000,9000)
        # imgload = get(pd_img) #해당URL로 이미지를 가져옴
        # with open("product{0}.jpg".format(code),"wb") as i:
        #     i.write(imgload.content)
        
        if product_count:
            rate = product_count.get_text()
            # print(rate)
            rate_txt = sub(r"[(,)]","",rate)
            #sub : 정규식 코드(파이썬), re 모듈을 로드해야함 (from re import *)
            # print(rate_txt)
        else:
            rate_txt = "등록된 평점이 없습니다."
        # print(rate_txt)
        product_name_txt = product_name.get_text()
        pd_txt = product_name_txt.strip() #strip 줄바꿈 및 공백 제거
        # print(product_name_txt.replace(" ","").replace("\n",""))
        pd_txt2 = pd_txt.replace(",","") #쿠팡 상품명에 ,로 구분자를 없앰
        # print(pd_txt2)
        
        money = product_money.get_text()
        money_txt = money.replace(",","")
        #replace(",","",1) : 1개만 수정
        #replace(",","") : 해당 단어에 모든 단어를 수정   
        # print(money_txt)
        
        
        # print(product_name,product_money,product_count)
        # print("상품명 : "+pd_txt2 + ", 가격 : "+money_txt+", 평가 : "+rate_txt)