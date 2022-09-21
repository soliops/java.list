#py17.py를 로드합니다.

#import py17
from py17 import *
#단점 : 파일 2개를 같은 방식으로 로드하게 되면 함수가 어떤 파일 것인지 헷갈린다
#하나는 import py16, 하나는 from py17 import * 이런식으로 구분해야함

#모든 함수는 py17.py에 적용되도록 코드를 작성
abc("홍길동") #해당
result = bbb(20)    #return 함수는 py18에서 출력
print(result)
ccc("오늘의 IT 주요뉴스", "데일리 뉴스")
