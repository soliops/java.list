# Class 선언 방식 및 메소드 형태
class box: #class를 선언
    #__init__는 class 하나당 하나
    def __init__(self,a,b,c): #__init__클래스 호출시 바로 실행되는 함수
        self.a = a #self = JAVA(this)
        self.b = b
        self.c = c
        print("값은 {0},{1},{2}".format(self.a,self.b,self.c))
        
    def abc(self): #일반 메소드
        print(self.c)
box("홍길동",20,30) #__init__에 인자값을 전달
box(60,100,200)
c1 = box(5,15,15) #__init__에 인자값을 전달하면서 setter형태
c1.abc()    #abc메소드를 로드하여 getter형태

class box2:
    def __init__(self,name,id,pw):
        self.name = name
        self.id = id
        self.pw = pw
        
    def abc(self,email): #일반 메소드에 추가 인자값을 적용
        print("고객명 : {0}, 아이디 : {1}, 이메일 : {2}"\
              .format(self.name,self.id,email))
data = box2("이순신","Lee","qwer1234") #__init__에 값을 등록
data.abc("lee@naver.com")        #abc메소드에 추가로 값을 등록
data2 = box2("강감찬","kang","a123456")
data2.abc("kang@nate.com")        