from datetime import *

#오늘 날짜 및 시간 출력
today = datetime.now()
print(today.replace(microsecond=0))

#오늘 날짜
day = today.date()
print(day)

#현재 시간
time = today.time()
print(time.replace(microsecond=0))

#시간을 문자열로 변환 -> DB에 저장시 필요
datetime  = datetime.today()
print(datetime.strftime('%Y-%m-%d %H:%M:%S'))

