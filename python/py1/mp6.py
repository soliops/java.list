#막대 그래프 (bar,barh)
import matplotlib.pyplot as mpt
import mfont

person = ["이순신","강감찬","유관순"]
product =[46,10,86]
barcolor=["red","green","orange"] #배경색상
#bar : 막대 그래프
# bar = mpt.bar(person,product,color=barcolor)
# mpt.ylim(0,100) #ylim : 범위와 단위를 정할때 사용
#ylim(y축에 limit(단위, 최대범위))
# mpt.xticks(rotation=45)
#rotation : 출력 데이터 텍스트 45로 설정
# for idx, txt in enumerate(bar): # bar (문자,숫자 겸용)
    #txt.get_height() : 막대세로 값을 계산해서 출력
    # mpt.text(idx, txt.get_height(),product[idx],ha="center")


#bars
#가로 그래프
bar = mpt.barh(person,product,color=barcolor)
# mpt.xlim(0,100)
# bar[0].set_hatch('\\') #set_hatch : 배경에 간단한 모양 설정
# bar[1].set_hatch('*')
# bar[2].set_hatch('x')
for idx, txt in enumerate(bar): # bar (문자,숫자 겸용)
    #txt.get_width() : 막대가로 값을 계산해서 출력
    #주의점 barh 사용시 x축을 기준으로 get_width() 사용
    mpt.text(txt.get_width()+5,idx,product[idx],ha="center")
mpt.show()