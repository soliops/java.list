#양극형태 데이터 만들기
import pandas as pd
import matplotlib.pyplot as mpt
import mfont
#xls로 구성을 하면 usecols="탭 영어단어로 범위"
#pd.read_excel("person.xls")
#예) usecols="A,B,D:X"
# data = pd.read_csv("person.csv",encoding="EUC-KR",usecols=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23])
# data= pd.read_excel("person.xlsx",usecols="A,B,D:X")

#총 인구수
data= pd.read_excel("person2.xlsx",usecols="D:X")
##D:X   AA:AU   AX: BR

#남자 인구수
man= pd.read_excel("person2.xlsx",usecols="AA:AU")

#여자 인구수
woman= pd.read_excel("person2.xlsx",usecols="AX:BR")

#iloc(xls,xlsx) :  행번호에 맞춰서 해당 행에 있는 모든 데이터를 가져오는 형태
# print(data.iloc[1])

#컬럼값만 출력 (data.columns) : 컬럼 이름만 배열출력
# print(data.columns) 

# a_data = data.iloc[0]
# mpt.figure(figsize=(10,8))
# print(a_data)
# print(type(data.iloc[0])) #figure 그래프 이미지 x,y 늘려줌
# mpt.barh(data.columns,a_data//1000) #1000명 단위로 출력 

m_data = man.iloc[0] #man.columns 목차
w_data = woman.iloc[0] #woman.columns 목차
mpt.figure(figsize=(10,8))
mpt.barh(data.columns,-m_data//1000,label="남성인구") #남자데이터
mpt.barh(data.columns,w_data//1000,label="여성인구") #여자데이터
mpt.legend()
mpt.title("2022년 8월 남녀 인구 분포도")
# mpt.savefig("202208person.png",dpi="200")
mpt.show()