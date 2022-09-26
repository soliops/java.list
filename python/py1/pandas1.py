import pandas as pd
# from pandas import 
#Series => Time, Num, Data(간격에 맞춰서 배치된 데이터들의 값)

data = pd.Series([10,20,30,40]) 
#Servies로 배열값을 로드(인덱스를 자동으로 설정함)
# print(data)

#index 기본 숫자(0부터 시작), index를 이용하면 데이터 별명 명칭
data2 = pd.Series([17,19,20,17,16,15,16],index=["월","화","수","목","금","토","일"])
# print(data2["토"])
#지정된 index 별명을 출력하실 수 있습니다.

array = {
    "username" : ["홍길동","이순신","강감찬"],
    "userage" : ["30","46","27"],
    "usercp" : ["SKT","KT","LGT"]
}
#일반 python 형태의 배열 출력
print(array["username"])
pr = pd.DataFrame(array) #DataFrame을 이용해서 키가 있는 배열을 시각화 합니다.
print(pr["username"])
#[["키이름","키이름"]] : 원하는 키이름만 데이터를 시각화 합니다. 
print(pr[["username","usercp"]])

#키배열에 index명을 변경
pr = pd.DataFrame(array, index=["no1","no2","no3"])
print(pr)

#컬럼값을 위치 변경
pr2 = pd.DataFrame(array, columns=["usercp","username","userage"])