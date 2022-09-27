import matplotlib.pyplot as mpt
import mfont

x = [15,20,7,36]
#linewidth : 선 두께 1= px
#marker : 각 포인트 별로 모양을 말합니다.
#o : 원, v: 삼각형, x: X모양, * : *모양
#marker 부분은 공식사이트에 설명참조
#markerfacecolor (mfc) : 배경 색상
#markeredgecolor (mec) : 아웃라인 색상
#linestyle (ls) : solid, dashed, dotted
#color : 선 색상
# mpt.plot(x, linestyle="dashed" ,label="2022년 취업통계",linewidth=1,marker="o",markeredgecolor="orange",markerfacecolor="gray")

#축약어로 셋팅된 그래프 형태
mpt.plot(x, color="red",marker="o",mfc="blue",mec="green",ls="dashed",label="2022년 취업통계")
mpt.legend(loc=(0.7,0.1)) #label에 대한 탭을 표현 합니다.
#loc=(X축, Y축) = 0~1 사이의 값
#dpi (100기본) : 200,300 (이미지 저장시 그래프를 크게 저장할 수 있음)
mpt.savefig("graph1.png",dpi=200) #savefig 이미지로 저장 하는 함수
mpt.show()#무조건 제일 밑에서 실행