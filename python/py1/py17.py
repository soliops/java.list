#모듈화 파이썬 파일 py18 연계
def abc(data):
    print("전송된 데이터는 {0}".format(data))
    
def bbb(data2):
    a = 10
    b = a + data2
    return b

def ccc(data3,data4):
    print("{0}[{1}]".format(data3,data4))