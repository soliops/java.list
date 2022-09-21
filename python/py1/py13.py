#extends 형태의 파이썬 class

class box: #box는 추상 클래스
    def __init__(self,data1,data2):
        self.data1 = data1
        self.data2 = data2

class box2(box): #box2에서 box를 상속 받음
    def __init__(self, data1, data2,data3): #상속받을 때 인자값을 모두 가져옴
        box.__init__(self, data1, data2) #추상클래스에서 셋팅된 self로 이관함
        self.data3 = data3
    def abc(self): #추상클래스 + box2클래스 값을 출력하게 됨(self)
        print("data 값은 {0},{1},{2}"\
              .format(self.data1,self.data2,self.data3))
#box2를 호출해야만 box를 상속받아서 처리가 가능합니다.
a = box2("hong","홍길동","hong@nate.com")
a.abc() #box2에 있는 abc메소드를 호출하여 출력함
