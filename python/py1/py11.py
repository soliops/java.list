#pickle : json과 같은 데이터 객체 파일 입니다.
import pickle
from distutils.text_file import TextFile
data = {"고객명":"홍길동","나이":25,"취미":["볼링","축구","야구"]}
'''
files = open("file.pickle","wb") 
#w = wb 파일생성 및 저장 (인코딩이 별도로 필요하지 않음)
pickle.dump(data,files) #dump 객체를 생성 및 저장
files.close()

files2 = open("file.pickle","rb")
roadfile = pickle.load(files2)
print(roadfile)
'''

#with를 사용해서 이용되는 pickle
with open("file.pickle","wb") as files: #as files라는 별명 선언
    pickle.dump(data,files)
    
with open("file.pickle","rb") as files2:
    loadfile = pickle.load(files2)

print(loadfile)

#with로 파일을 저장하는 형태
with open("abc.txt","w") as textfile:
    textfile.write(str(data))