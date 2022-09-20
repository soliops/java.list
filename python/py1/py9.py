#파일 저장
from idlelib.iomenu import encoding
from pickle import TRUE

#해당 파일을 생성하는 형태
#open("파일명","읽기(r),쓰기(w),수정(a)","언어셋") : 파일생성 및 저장
# files = open("./data.txt","w",encoding="UTF-8")
# print("홍길동",file=files) #file = 해당 파일명에 데이터를 저장시킴
# print("이순신",file=files)
# files.close() #open된 파일을 close로 종료

#해당 파일을 수정하는 형태
'''
files=open("./data.txt","a",encoding="UTF-8")
print("유관순",file=files)
print("강감찬",file=files)
files.close()
'''


#해당 파일을 읽어오는 형태
files=open("./data.txt","r",encoding="UTF-8")
# print(files.read())
# print(files.readline()) #데이터를 한줄씩 읽어서 오는 함수

#반복문으로 파일에 문자값을 가져옴
while True: #무한루프
    line = files.readline() #파일에 있는 라인별로 읽어옴
    if not line : #만약에 더 이상 읽을 라인이 없을 경우
        break
    print(line,end="") #end="" : readline은 엔터 기능이 있으므로 공백을 삭제시킴

files.close()
#end는 출력 마지막에 적용할 문자, 숫자를 표기할 수 있습니다.
print("홍길동",end="25")

# for-in 으로 파일을 읽어오는 형태
files=open("./data.txt","r",encoding="UTF-8") 
for lines in files.readlines(): #readlines 이용해서 반복문 출력
    print(lines,end="")
files.close()