
import java.util.Scanner;
public class Class_array3 {

	public static void main(String... args) {
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
		String a1[]= {"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[]={"100","80","39","60","55"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요.");
		String usernm = sc.next();
		
		
		jumsu j= new jumsu();
		j.ck(a1,a2,usernm);  // ->3개 class로 던지면 똑같이 3개 받아야한다.
		//j.ck(a1,a2,userm) <-()안에 것은 매개변수
		//j.ck(1,2,3,4)<- 인수값(인자값)
		sc.close();
		}
	}

class jumsu {
	//메소드에 ()안에 값, 받는 것도 매개변수
	public void ck(String data1[],String data2[], String user) {
		//System.out.println(Arrays.toString(data2));
		
		int w=0;
		int ea = data1.length;
		boolean ck =false;
		do{
			if(user.equals(data1[w])) {//배열에 동일한 값이 있을 경우
				String js = data2[w];
				System.out.printf("%s님은 %s점 입니다.",user,js);
			ck=true;	
			}
			w++;
		}
		while(w<ea);
		if(ck==false) {	//main class에서 사용자 검색을 하였을 경우 배열값에 없는 상황
		System.out.println("검색하고자 하는 사용자는 확인이 안됩니다.");	
		}
		
		
		
		}
	}