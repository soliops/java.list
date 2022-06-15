
public class example7 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열로 생성 + 외부 class 및 메소드 사용
		 * [data]
		 * {"홍길동","합격"},
		 * {"이순신","합격"},
		 * {"강감찬","불합격"},
		 * {"김유신","합격"},
		 * {"유관순","불합격"},
		 * {"장보고","불합격"}
		 * 
		 * 다차원 배열 형태이며, 해당 값을 합격자만 출력되도록 합니다.
		 * 단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 * 
		 * 결과 : 홍길동, 이순신, 김유신
		 */
		
		passlist pass1= new passlist();
		pass1.pass();
		
		
		
		
	}
	
}
class passlist{
	public void pass () {
		String data[][] = {
			 {"홍길동","합격"},
			 {"이순신","합격"},
			 {"강감찬","불합격"},
			 {"김유신","합격"},
			 {"유관순","불합격"},
			 {"장보고","불합격"}
		};
		
		int ea = data.length;
		int pea = data[0].length;
		int w=0;
		do {
			int ww=0;
			do {
				if (data[w][ww].equals("합격")) {
					System.out.print(data[w][0]+", ");
					
					///    \n하면  printf도 한줄씩 내린다. 
				}
				ww++;
			}while(ww<pea);
		w++;
		}while(w<ea);
	}
}