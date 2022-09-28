#그래프형태 2가지 사용시 데이터 컬럼 갯수가 같아야함
import pandas as pd
import matplotlib.pyplot as mpt
import mfont

data= pd.read_excel("person2.xlsx",usecols="D:X")

#남자 인구수
man= pd.read_excel("person2.xlsx",usecols="AA:AU")

#여자 인구수
woman= pd.read_excel("person2.xlsx",usecols="AX:BR")

#data.T or data : 인덱스에 대한 위치가 변경됨
#데이터 출력할 경우 bar 그래프가 올바르게 반영이 되지 않음
mpt.figure(figsize=(10,8))
titles=data.columns;
mandata = man.loc[0]
mpt.bar(data.columns,man.loc[0])
print(mandata)

#plot 그래프
# mpt.plot(data.index,man//1000,marker="o")
# mpt.plot(data.index,woman//1000,marker="o")
# print(data.T)
mpt.show()