import pandas as pd
from sqlite3 import *
from dbconnect import *

sqlin = connect.cursor()

# sqlin.execute("select * from test3")
# for data in sqlin.fetchall():
# 1: 아이디 2: 패스워드 3:사용자명     
#      print(data[1])
    
    # con = connect.create_enine()
sqlin = connect.cursor()
     
sql = "select * from test3"
#read_sql_query, read_sql(pandas 전용 DB연결 형태)
#pd.read_sql_query("SQL문법","DB접속정보")
data = pd.read_sql_query(sql,connect) 

#삭제형태로 가져오는 컬럼형태
# data = data.drop(columns = ["midx","mpw","mtel"])

#저장할 컬럼만 가져오는 형태
data = data[["mid","mnm","mage"]]
data = pd.DataFrame(data)
data = data.rename(columns={"mid":"아이디","mnm":"이름","mage":"나이"})
# print(data)
data.to_csv(r"test3.csv",encoding="EUC-KR")

    