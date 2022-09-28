import pandas as pd
import matplotlib.pyplot as mpt
import mfont
import numpy as no #

data = pd.read_csv("area.csv",encoding="EUC-KR")

f,axes = mpt.subplots(2,2,figsize=(15,15))
f.suptitle("각 지역별 유류가격 데이터")

axes[0,0].bar(data["지역"],data["휘발유"],label="휘발유 가격")
axes[0,0].set_title("지역별 휘발유 가격비교")
axes[0,0].set_facecolor("lightyellow")
axes[0,0].legend()

#두번째
axes[0,1].plot(data["지역"],data["경유"],label = "경유 가격",marker="o")
axes[0,1].set_title("지역별 경유 가격비교")
axes[0,1].legend()


#세번째
axes[1,0].barh(data["지역"],data["LPG"],label="LPG 가격")
axes[1,0].set_title("지역별 LPG 가격비교")
axes[1,0].legend()

#네번째
area=data["지역"];
#len(area) : 배열갯수 확인

#no.random : numpy전용 랜덤
#rand(생성갯수)
sizes= no.random.rand(17)*1000 #random 소수점
print(area)
print(sizes)

axes[1,1].scatter(data["휘발유"],data["LPG"],s=sizes)
axes[1,1].set_title("분석값")


mpt.show()