import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/* 응용문제. 조건문 코드를 작성하시오.
		 * 
		 * 고객이 자신의 통장에서 입,출금을 하는 프로세스를 제작해야 합니다.
		 * 고객의 기본 자산금액 : 100000
		 * 
		 * "1번 입력시 입금, 2번 입력시 출금 입니다."라는 메세지가 
		 * 제일 먼저 실행되어야 합니다.
		 * 1번을 입력시 "해당 금액을 입력하세요."
		 * 사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산금액을 출력하시면 됩니다.
		 * 
		 * "2번 입력시 "출금할 금액을 입력하세요."
		 * 사용자가 입력한 금액 - 기본 자산금액을 계산하여
		 * 총 자산금액을 출력하시면 됩니다.
		 * 
		 * */
		
		
		int money = 100000;
		System.out.println("1번 출력시 입금, 2번 입력시 출금 입니다.");
        Scanner a = new Scanner(System.in);
        int memo = a.nextInt();
        if (memo==1) {			
        	System.out.println("해당 금액을 입력하세요.");
		}
        else if (memo==2) {
        	System.out.println("출금할 금액을 입력하세요.");
			
		}
        
        Scanner b = new Scanner(System.in);
        int user = b.nextInt();
        if (memo==1) {
        	System.out.println(money+user);
		}
        else if (memo==2) {
        	System.out.println(money-user);
		}
        a.close();
        b.close();
        
		/*
		 * int money = 100000;
		System.out.println("1번 출력시 입금, 2번 입력시 출금 입니다.");
        Scanner a = new Scanner(System.in);
        int memo = a.nextInt();
        Scanner b = new Scanner(System.in);
        if (memo==1) {			
        	System.out.println("해당 금액을 입력하세요.");
        	int user = b.nextInt();
        	System.out.println(money+user);
		}
        else if (memo==2) {
        	System.out.println("출금할 금액을 입력하세요.");
        	int user = b.nextInt();
        	System.out.println(money-user);
			
		}
        a.close();
        b.close();
        /*
        if (memo==1) {
		}
        else if (memo==2) {
		}*/
        
        /* int money = 100000;
        Scanner a = new Scanner(System.in);
    	System.out.println("1번 출력시 입금, 2번 입력시 출금 입니다.");
        int memo = a.nextInt();
        int user;
        Scanner b = new Scanner(System.in);
        if (memo==1) {			
        	System.out.println("해당 금액을 입력하세요.");
        	int user = b.nextInt();
        	money=money+user;
		}
        else if (memo==2) {
        	System.out.println("출금할 금액을 입력하세요.");
        	int user = b.nextInt();
        	money= money-user
       	else{System.out.println("정상적인 코드가 아닙니다.");
       		a.close();
        	System.out.printf("해당 금액은 %d원 입니다.", money);
}
        	a.close();
        	b.close();
        
         */
	}

}
