#그래프형태 2가지 사용시 데이터 컬럼 갯수가 같아야함
import pandas as pd
import matplotlib.pyplot as mpt
import mfont

data= pd.read_excel("person2.xlsx",usecols="D:X")

#남자 인구수
man= pd.read_excel("person2.xlsx",usecols="AA:AU")

#여자 인구수
woman= pd.read_excel("person2.xlsx",usecols="AX:BR")

#bar 그래프 (남자데이터) //100 (단위 숫자가 만단위가 넘어갈 경우)
#data.T or data : 인덱스에 대한 위치가 변경됨
#데이터 출력할 경우 bar 그래프가 올바르게 반영이 되지 않음

#subplots, subplot : 한개의 그래프에 여러 데이터를 보여줄 때
fig, ax1 = mpt.subplots(figsize=(10,8))
titles=data.columns;
mandata = man.loc[0]//100
ax1.bar(data.columns,mandata,color="orange",label="남자")
ax1.set_ylim(0,30000) #세로 데이터의 최대치 값
ax1.set_ylabel("남자 전연령 데이터")
ax1.legend()
for idx, txt in enumerate(mandata):
    ax1.text(idx, txt+50,format(txt,","),ha="center")

#plot 그래프 (여자데이터)
# mpt.plot(data.index,man//1000,marker="o")
#바 그래프가 남성 데이터와 겹치지 않게 하기 위해서
womandata =woman.loc[0]//200 #//50 단위 숫자가 만단위가 넘어갈 경우
ax2 = ax1.twinx()
#데이터에 추가로 별도의 수치값을 표현(ax1에 대한 수치 포함)
ax2.set_ylim(0,30000) 
ax2.set_ylabel("여자 전연령 데이터") #추가 수치값에 대한 도움말을 출력
ax2.plot(data.columns,womandata,color="red",marker="o",label="여자")
mpt.legend(loc="center left")
# print(data.T)

#선 그래프에 해당 수치값을 표현
#그래프에 수치값 표현시 주의점은 값을 나누어서 표현할경우
#+1,+10 표현이 안됨 좀더 많은 숫자를 입력해야만 적용됩니다.
for idx2, txt2 in enumerate(womandata):
    ax2.text(idx2, txt2+50,format(txt2,","),ha="center")
mpt.show()