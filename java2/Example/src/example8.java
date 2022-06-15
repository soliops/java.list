
import java.util.Arrays;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/* 
		 다음 사용자 복권 관련 프로그램을 요청하였습니다.
		 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 "1~46 번 사이의 숫자를 입력해 주세요:"
		 사용자가 입력한 5개의 숫자를 배열로 생성합니다.(main에서 처리)
		 
		 외부 class를 이용하여 PC가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		 PC가 뽑은 5개의 숫자를 배열로 생성합니다.(외부 class method로 생성)
		 
		 별도의 결과 method를 하나 더 생성하여
		 사용자가 입력한 5개의 배열 데이터와 PC가 뽑은 배열 데이터를
		 해당 method로 전달하여, 출력하시면 됩니다.
		 
		 단, 모든 사용하는 반복문은 무조건 do-while문으로 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int w= 0;
		int user[] = new int[5];
		do {
			System.out.println("1~46 번 사이의 숫자를 입력해 주세요:");
			int input = sc.nextInt();
			user[w]= input;
	
			w++;
		}while(w<5);
		sc.close();
		//System.out.println(Arrays.toString(user));
	
		Lotto a = new Lotto();
		a.pcprint(user);
		
	}
		
	}
	class Lotto {
		public void pcprint(int usernum[]) { //pc결과 출력
			int pcnum[]=new int[5];
			int ww=0;
			do {
				int pc =(int) (Math.random()*46+1);
				pcnum[ww]=pc;
				ww++;
			}while(ww<5);
			//System.out.println(Arrays.toString(pcnum));
			Lotto b = new Lotto();
			b.print(usernum,pcnum);
		}
		public void print(int usernum2[],int pcnum1[]) {  //사용자, pc결과들
			System.out.println(Arrays.toString(usernum2));
			System.out.println(Arrays.toString(pcnum1));
		}
	}