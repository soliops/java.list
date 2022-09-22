# pyqlite3, pysqlite, sqlite3
from sqlite3 import * #pip install pysqlite3
# from MySQLdb import * #pip install mysqlclient
from dbconnect import *

#database에 연결
# connect = connect(
#     user = "opete95",
#     passwd = "soli5857!@",
#     host = "umj7-009.cafe24.com",
#     db="opete95"
#     )

cur = connect.cursor() #명령어를 입력시키기 위한 대기상태
cur.execute("select * from test3")
#execute : 콘솔상태에 문자값을 입력하는 것을 말함
for a in cur.fetchall(): 
    #fetchall : select에 대한 data를 문자열 형태로 가져옴
    print(a)
cur = connect.cursor()
# cur.execute("insert into test3 values ('0','song','aaa123','송아지2','01012345678','23')")

#java에서 ?를 이용하여 sql에 사용하는 statement와 비슷한 형태 구조를 가집니다.
# sql = "insert into test3 values ('0',%s,%s,%s,%s,%s)"
#with를 이용하여 여러개의 데이터를 한꺼번에 저장,수정,삭제를 할 수 있습니다.
# with connect:
#     cur.execute(sql,('red','red1234','레드','01011112222','33'))
#     cur.execute(sql,('blue','blue1234','블루','01022223333','44'))
#     cur.execute(sql,('green','green1234','그린','01044445555','55'))    
#     connect.commit()
# connect.commit()  
#commit를 사용해야 하는 이유는 insert 후
#delete를 바로 해버리는 파이썬 특유의 행동 부분입니다.

# page 286
# con = connect("./test.db")
# create = con.cursor()
# create.execute("create table test(\
# idx int(4) not null,\
# name varchar(200) not null,\
# primary key(idx));")

# insert = con.cursor()
# insert.execute("insert into test values ('0','hong');")