#배열로 만들기 
age = [10,20,30,40,50,60,70,80,90,100]
print(age[1])

person = ["홍길동","이순신","강감찬"]
print(person[2])

print(person.index("이순신")) #index 배열에 몇번째 노드에 있는지 확인
print(len(person)) #배열 총 갯수

person.append("유관순")
print(person)
person.remove("유관순")
print(person)
person.insert(2,"세종대왕") #insert 배열값에 원하는 위치에 값을 적용할 경우
print(person) #insert(노드번호, 추가할 값)
print(person.pop()) #pop() 값을 뒤에서 부터 차례대로 가져오게됨
print(person.pop()) #pop() 값을 뒤에서 부터 차례대로 가져오게됨
numbers = [5,6,7,1,8,3,2,6]
numbers.sort() #오름차순으로 배열나열
print(numbers)
numbers.reverse() #내림차순으로 배열나열
print(numbers)

numbers.clear() #배열값을 비움
print(numbers)

datas=["hong","홍길동",33,3000,False]
datas2=["면도기","신발","바지","이어폰"]

#datas에 있는 배열값과 datas2에 있는 배열값을 datas에 종속시킴
datas.extend(datas2)
#배열값을 종속 시킬때는 변수로 받아서 처리하지 않습니다.
print(datas)
#해당 배열 변수명을 출력

#키 값이 있는 배열형태
infodata = {"mid":"hong","mname":"홍길동","age":33}
print(infodata["mname"]) #배열에 있는 키명으로 로드
print(infodata.get("mid")) #get이라는 함수를 이용해서 키 배열값을 가져오는 형태

#여러가지 데이터
infodata_1 = {"mid":["hong","lee"],"mname":["홍길동","이순신"],"age":[33,55]}
print(infodata_1["mname"][0])

# in은 키배열에 해당 키명이 있는지를 확인할 때 사용하는 문법입니다.
print("age" in infodata) #True
print("mtel" in infodata) #False

#키배열에는 append, insert라는 문법을 사용하지 않고 입력, 수정을 하실 수 있습니다.
infodata["tel"]="01023456677"
print(infodata)
infodata["age"]=30
print(infodata)

##키배열값에 키와 값을 모두 삭제
# del infodata["mid"]
# print(infodata)

infodata["mname"]=""
print(infodata)
infodata["mname"]="홍길동"

#키 이름만 출력할때 = Object.keys(JavaScript)
print(infodata.keys())
#키 배열에 값만 출력할때
print(infodata.values())
