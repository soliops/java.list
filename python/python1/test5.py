#문자열을 자르기 및 해당 문자열 가져오기(배열구조이므로 무조건 0부터 시작)
gender = "911101-2345678"
if(gender[7]==1):msg="남성"
else:msg="여성"
print("성별 : " + (gender[7]) ) #배열로 8번째 값을 가져옴
print("성별 : " + msg )
print("월일 : " + gender[2:6]) # 6번째 직전까지 문자를 가져옴 문자열(2~5)까지
print("생년월일 : " +gender[:6]) #무조건 0부터 시작하여 문자열을 가져옴
print("주민번호 뒷자리 : "+gender[7:]) #해당 문자열 번호 부터 끝까지 가져옴
print("생년월일 : " + gender[:-8]) #-1부터는 문자열을 거꾸로 넘버링을 하게 됩니다.
print("생년월일 : " + gender[-14:-8]) #-1부터는 문자열을 거꾸로 넘버링을 하게 됩니다.

word = "Python Programming"
print(word.lower()) #lower, upper
print(word.upper())
print(word[2].isupper()) 
# is는 문자열에 대한 검토를 할 대 사용하는 문법
# isupper, islower
print(len(word)) #len = length와 같은 뜻
print(len(word[:6])) #6
# print(word.replace("Python","java")) #replace는 단어를 변경할 때
print(word.index("g")) #해당 문자열에 대한 문자 위치 번호를 출력함
print(word.index("P"))
print(word.index("P",1))
i = word.index("P")
#해당 문자열에서 동일한 단어가 있어도 무조건 첫번째 찾는 단어에 대한 번호
i= word.index("P",i+1)
#해당 문자열에서 동일한 단어 다음것을 찾아서 출력하는 번호
print(i)
#find -1 : 문자열 또는 단어가 없을 경우
print(word.find("gra1")) #find 문자열을 찾을 때 사용됩니다. (indexOf 와 동일한 기능)
print(word.find("gram"))
print(word.count("P")) #동일한 문자 갯수가 몇개 인지를 카운팅하는 문법