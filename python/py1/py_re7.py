#데이터베이스 접속정보
from sqlite3 import *
from MySQLdb import *

con = connect(
    user = "",
    passwd = "",
    host = "",
    db = "",
    charset="utf8" #mysql콘솔에서 \status로 확인 꼭 할것
)

cur = connect.cursor()
sql = "select * from 테이블명"
cur.execute(sql)

for z in cur.fetchall():
    #select에서 fetchall함수를 이용하여 loop가 작동되도록 함
    print(z)

delsql = "delete from 테이블명 where 고유컬럼='고유값'"
cur.execute(delsql)

#insert, updata
insql = "insert into 테이블명 values(...)"
cur.execute(insql)
con.commit()