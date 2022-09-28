#빅데이터 분석 차트 형태
import pandas as pd
import matplotlib.pyplot as mpt
import mfont

data = [100,50,80,77,65]
data2 = [50,75,95,42,16]
total = [data[0]+data2[0],data[1]+data2[1],data[2]+data2[2],data[3]+data2[3],data[4]+data2[4]]
print(total)
#scatter : 산점도 그래프 (빅데이터 분석표)
#산점도 그래프는 무조건 sizes를 정해서 출력하게 됩니다.

#별도데이터
cdata= ["red","blue","green","orange","gray"]
data3 = ["서울","경기도","세종시","광주시","대구시"]
# mpt.scatter(data,data2,sizes=total)

mpt.scatter(data,data2,sizes=total,color=cdata)

#scatter에 반복문을 이용해서 text값을 출력시킴
for a, textin in enumerate(data3):
    mpt.text(data[a]-3,data2[a]+3,data3[a])

#컬러로 색상 바를 표현하는 형태 
mpt.colorbar(orientation = "horizontal")
#orientation 기본 수직형태이고 horizontal은 가로
mpt.title("각 지역별 차량 보유대수")
mpt.xlabel("휘발유 차량")
mpt.ylabel("경유 차량")
mpt.show()