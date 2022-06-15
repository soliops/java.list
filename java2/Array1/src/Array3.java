import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * {5,10,15,20,25,30,35}
		 */
		int data[] = {5,10,15,20,25,30,35};
		/*
		 * foreach문으로 사용할 때는 index 번호가 필요없이 사용할 경우
		 * for~do-while로 사용할 때는 인덱스 번호가 필요할 때 사용
		 * 
		 * [0] [1] [2] : 인덱스 번호
		 */
		//단순한 배열에서만 주로 사용함
		for(int f : data) { //inf f가 순차적으로 data배열값을 받아서 저장 시킵니다.
			if(f%2==0) {
		//		System.out.println(f);
			}
		}
//		/*
//		String pay[] = {"무통장 입금","신용카드","휴대폰","상품권","쿠폰"};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("결제하고자 하는 형태를 선택해주세요:");
//		String pm = sc.next();
//		for(String z : pay) { /*배열 데이터가 문자 이므로 
//		받는 변수형태 또한 문자형을 사용해야 합니다.*/
//			if(pm.equals(z)) {
//				if(z.equals("휴대폰")) {
//					System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
//				}
//				else {System.out.println(pm+"로 결제 진행 됩니다.");}
//			//	System.out.println(pm+"로 결제 진행 됩니다.");
//				
//			}
//		}
//		sc.close();
	
		
		/* 응용문제   ->//스캐너는 한번 돈다.
		 * {"햄버거", "피자", "치킨", "커피"}
		 * Q. "주문하고자 하는 음식을 선택해 주세요.?"
		 * 해당 질문은 총 4번을 물어보게 됩니다.
		 * 단, "주문종료"라고 사용자가 입력시 그 즉시 주문은 종료 되며,
		 * 주문내역을 출력하시면 됩니다. 
		 * 
		 * 스캐너로 질문과 입력까지, 4번 물어보는건 반복문, if 주문종료, 주문내역 출력,
		 */
		
		String menus[] = {"햄버거","피자","치킨","커피"};
		Scanner sc2 = new Scanner(System.in);
		String user;
		String user_menu[]=new String[4];
		int ct=0;
		for(String f : menus) {
			/* Scanner가 반복문 안에 적용시 loop로 무조건 반복하지는 않음.
			 * 사용자가 입력할 때마다 반복문 범위만틈 출력하는 형태임
			 * 
			 */
			System.out.println("메뉴를 선택해 주세요?:");
			user = sc2.next();
			if(user.equals("주문종료")) {
				break;
			}
			else {
				for(String ff : menus) {
					if(user.equals(ff)) {
						user_menu[ct]=ff;
						ct++;
					}
				}
			}
			//System.out.println(f);
			}
		sc2.close();
		System.out.println("주문하신 메뉴는 다음과 같습니다."+Arrays.toString(user_menu));
		
		
		/* 응용문제
		 * 배열
		 * 사용자가 장바구니에 내용을 결제 하게 됩니다.
		 * 단, 해당 금액 리스트를 출력하지 말고, 최종 전체 결제 금액만 
		 * 출력 되도록 합니다.
		 * 1500 22000 13000 14500 113800 45000
		 */
		
		
		
		
	}

}
