import java.util.Scanner;

public class Class_array4 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 다음 문자 배열 데이터 값이 있습니다.
		 * a1: 홍길동 이순신 강감찬 유관순 김유신
		 * a2: 100 80 39 60 55
		 * 
		 * "검색하고자 하는 이름을 적어주세요." 출력하게 됩니다.
		 * 검색어에 이순신이라고 검색을 하게 되면
		 * 이순신님은 80점 입니다. 라고 출력이 되어야 합니다.
		 * 
		 */
	String a1[]={"홍길동","이순신","강감찬","유관순","김유신"};
	String a2[]= {"100","80","39","60","55"};
	Scanner sc = new Scanner(System.in);
	System.out.println("검색하고자 하는 이름을 적어주세요.");
	String usernm=sc.next();
	
	jumsu1 j1=new jumsu1();
	j1.ck(a1,a2,usernm);
	sc.close();
	
	
	
	
	
	}
}

class jumsu1 {
	public void ck(String data1[],String data2[],String user){
		int w=0;
		int ea=data1.length;
		boolean ck=false;
		do {
			if(user.equals(data1[w])) {
				String js2=data2[w];
				System.out.printf("%s님은 %s점 입니다.",user,js2);
						ck=true;
			}
			w++;
		}while(w<ea);
		
		if(ck==false) {
			System.out.println("검색하고자 하는 이름을 적어주세요.");
		}
		
	}
	
	
	
	
}