import pandas as pd

data = {
    "area" : ["강남구","강동구","강북구","강서구"],
    "gasoline" : [1947,1812,1677,1721],
    "diesel" : [1947,1918,1809,1855],
    "ev" : [173.8,170,158.4,166]
}
pr = pd.DataFrame(data)
# ps=pr.to_csv("data.txt",encoding="EUC-KR")
#txt 파일로 저장 ,를 기준으로 저장됨, index=False를 사용하면 index번호가 삭제처리
# ps= pr.to_csv("data.txt",encoding="EUC-KR",index=False)

#xls로 저장함 (xlsx로는 파일을 열수 없는 사항이 됩니다.)
# ps =pr.to_csv("data.xls",encoding="EUC-KR",index=False)

#pandas에서 excel로 저장
#pip install xlwt
#pip install openpyxl
ps =pr.to_excel("data.xlsx")

