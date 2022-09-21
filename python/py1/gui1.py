from tkinter import *

def abc():
    print("테스트 인쇄")

root = Tk()
root.title("연습 프로그램") #프로그램 타이틀 이름
root.geometry("500x500") #가로크기 * 세로크기
root.resizable(True, True) #사이즈 자동 조절
btn1 = Button(root,text="클릭",command=abc) #command : 클릭시 함수호출
btn2 = Button(root, width=10, height=2, text="클릭2")
#width=10 = 100px, height=2 = 20px
btn1.pack()
btn2.pack()

root.mainloop() #GUI 프로그램 실행