#pie 원 그래프 형태

import matplotlib.pyplot as mpt
import mfont

data = [30,25,20,17,10,6]
text = ["1일차","2일차","3일차","4일차","5일차","6일차"]
color=["skyblue","green","red","gray","yellow","orange"]
#기본 형태
#원 그래프를 변형을 하기 위한 배열
# transform = [0.2,0.1,0.1,0,0,0] 

#원 그래프에 배열갯수에 맞춰서 모두 분리
transform = [0.1]*6#(배열갯수) 

#원 그래프를 변형을 하기 위한 배열

#autopct : 1개의 데이터당 %로 구분자를 두는 함수
#1f : 1개의 데이터에 소수점 1자리, f : float, i : int
#%% : 그래프에 %를 출력하기 위한 표시
#startangle : 원에 대한 각도 조절
#원 그래프 기본형태
#mpt.pie(data,labels=text,autopct="%.2f%%",startangle=1)

#원 그래프 변형 형태
mpt.pie(data,labels=text,autopct="%.2f%%",explode=transform,colors=color)
mpt.title("원 그래프 테스트")
mpt.legend(loc=(1,0.5)) #loc (위치변경) -> loc(x축,y축)
mpt.show()