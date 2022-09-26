#오름차순, 내림차순, 데이터 수정(보여지는 데이터만)
import pandas as pd
from idlelib.iomenu import encoding
data = pd.read_csv("area.csv",encoding="EUC-KR")

#오름차순 sort_values(ascending =True)
# print(data.sort_values("휘발유"))

#내림차순 (ascending=False)
# print(data.sort_values("휘발유",ascending=False))
# print(data["경유"].sort_values(ascending=False))

#index 숫자값으로 내림차순
# print(data.sort_index(ascending=False))

#두개 값을 내림차순 (2가지 키값을 비교)
print(data.sort_values(["휘발유","경유","LPG"],ascending=False))

#해당 컬럼에 있는 문자값만 변경
# print(data["지역"].replace({"서울":"서울특별시","인천":"인천광역시"}))

#모든 데이터값 중 해당 문자값을 변경
# print(data.replace({"서울":"서울특별시","인천":"인천광역시"}))

# -----------------------------------------
#기타문법(영어만 적용)
# print(data["지역"].str.upper()) #소문자를 모두 대문자
# print(data["지역"].str.lower()) #대문자를 모두 소문자

# --------------------------------------------
#컬럼값 추가하여 +,-,*,/ 등 산술연산으로 추가하는 방식
data["평균값"]= (data["휘발유"]+data["경유"]+data["LPG"])/3
# print(data)
#해당 컬럼값을 숨김 (실제 데이터가 삭제되지 않음)
print(data.drop(columns=["LPG"]))
print(data.drop(index=7)) #index 해당 번호 값을 숨김
