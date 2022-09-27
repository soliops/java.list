#matplotlib : 그래프 형태의 자료형
import matplotlib.pyplot as mpt #그래프 모듈
import mfont

x = [1,3,5] #가로값
y = [2,4,6] #세로값
# mpt.plot(x,y) #숫자리스트를 그래프로 표현함
# mpt.title("테스트 그래프") #그래프 화면에 제목
# mpt.show() #그래프 모듈 화면을 출력하는 역할을 합니다.

data = [1,5,9,10,2]
mpt.plot(data)
mpt.show()