import matplotlib.pyplot as mpt
import mfont

x=[10,20,30,40]
y=[15,25,35,45]

mpt.plot(x,y,label="테스트 그래프",color="red",marker="o")
mpt.legend()
#enumerate : 그래프 값 포인트 부분에
#배열에 값을 가져와서 text변환 함수
for idx, txt in enumerate(x):
    #idx(배열에 index 입니다. 0부터),txt(배열값)
    mpt.text(x[idx],y[idx]+0.7,txt,fontsize=16,ha ="right",color="blue")
    #ha : left, right, center 반대방향
    #fontsize : 글자크기
    #x[idx]+0.5 : x배열값 (위치)에 글자를 0.5만큼 이동시켜서 출력
    #y[idx]+0.5 : y배열값 (위치)에 글자를 0.5만큼 이동시켜서 출력
    
mpt.show()