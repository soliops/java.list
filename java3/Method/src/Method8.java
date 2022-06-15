
public class Method8 {

	public static void main(String[] args) {
		/*
		 응용문제 
		 협업 프로그래머가 해당 DB(Database)에 값 중
		 홀수값에 대한 총 갯수를 받고자 합니다. 
		 해당 갯수를 출력 될수 있도록 코드를 작성하시오.
		  
		 */
		
		

		odbc db = new odbc();
		System.out.println(db.odbc1());
		
		
		}
	
}

class odbc{
	private int ori[];  //배열값이 변경되지 않도록 사용
	private	int count=0; //홀수일 경우 +1씩 증가 하기 위한 필드 변수값

	public odbc() {
		int odata[] = {15,22,17,14,32,35,19,33};
		this.ori = odata;		
		
	}
	public int odbc1() {
		
		int w = 0;
		do {
			
			if(this.ori[w]%2==1) {
				this.count++; //홀수 일 경우 +1씩 증가
			}
			
			w++;
		}while(w<+this.ori.length);
		return this.count; //최종 값을 return시킴.
		

	}
}
