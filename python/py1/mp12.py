#산점도 응용 부분
import pandas as pd
import matplotlib.pyplot as mpt
import mfont

#scatter : x축, y축
data = pd.read_csv('movie.csv',encoding="EUC-KR")
# c : color + cmap(자동색상)

#scatter에서 text사용시 x축, y축에 대한 값이
#모두 int로 이루어져 있어야 반복문으로 적용할 수 있습니다.
mpt.scatter(data["지역"],data["관객수"],sizes= data["관객수"]*5,c=data["관객수"])

mpt.colorbar()
mpt.xlabel("지역")
mpt.ylabel("관객수")


mpt.show()