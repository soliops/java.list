import pickle as io#파일 저장, 읽기

# pf = open("array.pickle","wb")
#w : 텍스트(write) 저장, wb : 저장(dump) + 바이너리
#r : 텍스트 읽기(read), rb : 읽기(load) + 바이너리
# data = [1,2,3,4,5]
# io.dump(data,pf)
# print(pf)
#
# rf = open("array.pickle","rb")
# result = io.load(rf)
# print(result)
# rf.close()

#문자 전용 방식
pf = open("array.txt","w")
data = "홍길동"
# result = io.dump(data)
print(data,pf)
pf.close()