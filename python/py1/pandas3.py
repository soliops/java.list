#csv 저장
import pandas as pd

data = {
    "area" : ["강남구","강동구","강북구","강서구"],
    "gasoline" : [1947,1812,1677,1721],
    "diesel" : [1947,1918,1809,1855],
    "ev" : [173.8,170,158.4,166]
}
#csv 생성시 DataFrame을 무조건 선언 후 저장합니다.
# pr = pd.DataFrame(data)
# pr.index.name = "유가리스트"
#to_csv는 csv 파일로 저장하는 함수 (pandas 전용 문법)
# pr.to_csv("opinet.csv",encoding="EUC-KR")
#encoding : csv 파일은 기본으로 EUC-KR을 사용

#csv 파일 읽기, 기본 encoding="EUC-KR"설정
data2 = pd.read_csv("opinet_test.csv",encoding="EUC-KR")
print(data2)
