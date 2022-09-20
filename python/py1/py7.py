#전역변수, 지역변수
box="변수값"
box3 ="" #최초 전역변수값에 비어있는 값
#전역변수는 절대 값이 변화가 없음 단, global = static
def afunction():
    global box3 #전역변수명을 호출함
    print(box)
    box2="변수값2"
    print(box2)
    print(box3) #전역변수값이 출력
    #만약에 global이 없을 경우 새로 지역변수가 생성되며,
    #global 적용시 전역변수에 새로운 값을 적용하게 됩니다.
    box3="변수값3" #afunction실행시 box3에 문자값이 입력됨
def bfunction():
    print(box)
    #print(box2) error afunction에서 사용하는 변수를 bfunction에서 사용
    print(box3) #global 선언을 했다면 변수값3이라고 출력됨 아니면 ""이라고 출력됨
    #단, afunction보다 bfunction이 먼저 실행될 경우 빈값이 출력
afunction()
bfunction()