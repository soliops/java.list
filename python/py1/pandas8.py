#함수 이용하기
import pandas as pd
from idlelib.iomenu import encoding

data = pd.read_csv("area.csv",encoding="EUC-KR")

def add_liter(z):
    return str(z)+"L"

#data["휘발유"] = type은 Object임
# data["휘발유"] = data["휘발유"].apply(add_liter)
# print(data["휘발유"])

#해당 함수에 조건문을 적용하여 값을 변동하는 형태
def add_literck(k):
    if k > 1700:
        return str(k)+"L"
    return str(k)

data["휘발유"] = data["휘발유"].apply(add_literck)
print(data["휘발유"])