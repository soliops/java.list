import matplotlib.pyplot as mpt #그래프 모듈
import mfont

#X축, Y축 모두 배열의 갯수는 같아야 합니다.
#x,y축 중 데이터에 대한 숫자 값은 무조건 있어야 합니다.
#그래프로 Y축에 한글, x축에 숫자로 표현 또는 반대 입니다.

# x=[10,15,27]
# y=["서울","인천","경기"]
# mpt.plot(y,x) #(x축값, y축값)
# mpt.xlabel("X축",color= "blue",loc="left") # left, rigth, center
# mpt.ylabel("Y축",color="#22FFCC", loc="top") #top,center, bottom
# mpt.show()

x1 = [1,2,3]
y1 = [3,6,9,12]
mpt.plot(x1,y1)   # 본데이터는 무조건 갯수가 같아야함
# mpt.xticks(x1) #xticks : X축에 대한 라벨 출력형태
# mpt.yticks(y1) #yticks : Y축에 대한 라벨 출력형태
# mpt.show()

#응용부분
data1 = [25,30,22,41]
data2 = [10,20,30,40]
#ticks 본데이터에서 라벨을 꾸며주는 형태
mpt.xticks(data1,["1월","2월","3월","4월"])
mpt.yticks(data2,[15,25,35,45])
mpt.plot(data1,data2) #본데이터 출력
mpt.show()