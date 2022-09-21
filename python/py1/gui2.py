from tkinter import *
from pkg_resources._vendor.jaraco.context import null


root = Tk()
root.title("연습 프로그램")
root.geometry("500x500")
root.resizable(False,False)

txt = Entry(root, width=30) #Entry 한줄짜리 input(height X)
#Text로 사용할 경우 insert와 함께 사용하여 적용해야함 (width, height O)
txt.pack()

txt2 = Text(root,width=60,height=2)
txt2.pack()
#Text (1="첫번째행".0="열의 첫번째 위치" , END="마지막단어까지")
txt2.insert(END,"")

def aaa():
    url = txt.get()
    url2 = txt2.get(0.1, END)
    print(url)
    print(url2)
btn = Button(root,width=8,height=2,text="크롤링",command=aaa)
btn.pack()

root.mainloop()