import pandas as pd
from idlelib.iomenu import encoding
data = pd.read_csv("area.csv",encoding="EUC-KR")

#출력 조건문 True/False로 출력 (숫자 위주로 사용)
#print(data["휘발유"]<=1700)

#변수에 조건을 적용하고 해당 조건을 배열키로 적용하여
#필터링 하게 됩니다.
# filter = (data["휘발유"]<=1700)
# print(filter)
# print(data[filter]) #1700이하
# print(data[~filter]) #1700이상 ~(반대)

filter2 = (data["휘발유"]<=1700) & (data["지역"]=="대구")
print(data[filter2])
filter3 = (data["휘발유"]<=1700) & (data["경유"]<=1800)
print(data[filter3])