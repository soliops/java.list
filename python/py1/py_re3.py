#파이썬 배열 선언시 중요사항
adata = {10,5,6,7,6,3,10,6} #중복데이터 삭제
print(adata)
adata2 = [10,5,6,7,6,3,10,6] #중복데이터 출력
print(adata2)

#배열값을 반복문 가져오는 형태
for no in adata2:
    print(no)
    
#for문 배열형태2
adata3 = {"data1":[1,2,3,4],"data2":["5","6","7","8"]} 
for k in adata3:
    for kk in adata3[k]:
        print(kk)

#for문 배열형태3 (enumerate)
adata4 = [100,200,300,400,500]
for idx,no in enumerate(adata4): 
    #enumerate : 인덱스, 변수명을 이용해서 출력
    print(no)
    print(adata4[idx])

#while문
w=0
while w<5:
    if w==2:
        print(w)
        break #continue : 반복순서를 넘기는 형태
        #break : 반복문 정지
    w+=1 # ++, --(없음), +=,-=(+-1증가)
    
