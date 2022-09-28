#막대그래프 + pandas
import pandas as pd
import matplotlib.pyplot as mpt
import mfont

data = pd.read_csv("area.csv",encoding="EUC-KR")
# 해당 데이터가 전체적으로 높은 순위부터
# 그래프에 반영을 하는 것을 추천
# mpt.bar(data["지역"],data["경유"])
# mpt.bar(data["지역"],data["휘발유"])
# mpt.bar(data["지역"],data["LPG"])

#데이터를 지속적으로 누적시켜서 출력하는 형태
mpt.bar(data["지역"],data["경유"],label="경유")
mpt.bar(data["지역"],data["휘발유"],label="휘발유")
mpt.bar(data["지역"],data["LPG"],label="LPG")
#bottom: 데이터를 출력할 때 해당 값과 누적시켜서 그래프 표현 됩니다.
mpt.bar(data["지역"],data["경유"],bottom=data["LPG"]+data["휘발유"],label="총금액")
mpt.legend()
mpt.show()