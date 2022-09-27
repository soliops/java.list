import matplotlib.pyplot as mpt
import mfont

days = [7,8,9] #월별
azn = [100,156,112] #아스트라제네카
pfz = [95,112,198] #화이자
sen = [92,88,76] #얀센
mod = [74,69,87] #모더나

#plot 선으로 이루어진 그래프
mpt.plot(days,azn,label="아스트라제네카",marker="o")
mpt.plot(days,pfz,label="화이자",marker="o")
mpt.plot(days,sen,label="얀센",marker="o")
mpt.plot(days,mod,label="모더나",marker="o")
mpt.xticks(days,["7월","8월","9월"])
for idx,txt in enumerate(azn):
    mpt.text(days[idx],azn[idx]+5,txt,ha="center",color="blue")
for idx,txt in enumerate(pfz):    
    mpt.text(days[idx],pfz[idx]+5,txt,ha="center",color="yellow")
for idx,txt in enumerate(sen):
    mpt.text(days[idx],sen[idx]+5,txt,ha="center",color="red")
for idx,txt in enumerate(mod):
    mpt.text(days[idx],mod[idx]+5,txt,ha="center",color="green")
mpt.legend(ncol=2)
#ncol : 한줄에 몇개의 label을 출력하는지 선정
mpt.show()