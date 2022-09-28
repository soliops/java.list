#원 그래프 응용편
import pandas as pd
import matplotlib.pyplot as mpt
import mfont

data = [30,25,20,17,10,6]
text = ["1일차","2일차","3일차","4일차","5일차","6일차"]
w = {"width":0.1}#0~1까지 width 원에 대한 두께 기본 1
#webgeprops : 원 안에 빈 공간에 대한 크기를 반영하는 함수
# mpt.pie(data,labels=text,autopct="%.1f%%",wedgeprops=w)
# mpt.legend(loc=(1,0.5))

csv = pd.read_csv("movie.csv",encoding="EUC-KR")
gp = csv.groupby("영화관")
# print(gp.size())
#gp.size() : 해당 파트별로 그룹 갯수를 출력합니다.

#data2 는 배열로 각 파트별 갯수를 생성
data2= [gp.size()['cgv'],gp.size()['megabox']]
text2=["CGV","MEGABOX"]
mpt.pie(data2,labels=text2)
mpt.title("영화관 상영 개수형태")

mpt.show()