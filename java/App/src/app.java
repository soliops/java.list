
public class app {

	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	int c;
	// 사칙연산기호 : + , - , * , / 
	//c = a + b;
	//c = a - b;
	//c = a * b;
	c = a / b;
	
	System.out.println(c);
    String a1 = "홍길동";
    String b1 = "환영합니다.";
    String c1;
    c1 = a1 + b1; //문자형태 일때 +는 문자+문자열로 표현할 수 있습니다.
    System.out.println(c1);
    
    /* 응용문제.
     * 다음과 같이 출력되는 코드를 완성하시오.
     홍길동님 적립금은 50000 입니다.
     단, 홍길동 과 50000의 값은 지속적으로 변화할 수 있습니다.
     */
    String mname = "홍길동";
   	int mpoint = 50000;
     
    System.out.println(mname+"님 적립금은 "+mpoint+" 입니다.");
    
    String mname1 = "홍길동";
   	int mpoint1 = 50000;
    String msg = mname1+"님 적립금은 "+mpoint1+" 입니다.";
    System.out.println(msg);
    
    String a11;
    a11 = "홍길동";
    String b11 = "님 적립금은 ";
    int c11;
    c11 = 50000;
    String d11 = " 입니다.";
    String e11;
    e11 = a11 + b11 + c11 + d11;
    System.out.println(e11);
    
    /* 응용문제
     * 아마존 사이트에서 상품을 구매 했습니다.
     * 장바구니에 담은 상품 가격을 모두 더해서 총 결제 금액이 
     * 출력되도록 하시오. 단, $ 환율로 출력 되어야 합니다.
     * 8.25
     * 4.02
     * 3.71
     * 결과 값은 다음과 같이 출력하세요.
     * 총 결제금액 $ 입니다.
     * 
     */
    double p1,p2,p3,p4;
    p1 = 8.25;
    p2 = 4.02;
    p3 = 3.71;
    p4 = p1 +p2 +p3;
    System.out.println("총 결제금액 $"+p4+" 입니다.");
    
     double a12 = 8.25;
    double b12 = 4.02;
    double c12 = 3.71;
    String msg1 = "총 결제금액 $" +(a12 + b12 + c12)+ " 입니다.";
    System.out.println(msg1);
    // 내가 한거
    double a13 = 8.25 + 4.02 + 3.71;
    System.out.println("총 결제금액 $"+ a13 + " 입니다.");
    // 내가 한거
   
    int k = 9;
    int j = 3;
    double aw = k/j;
    System.out.println(aw);
   
    int k1 = 3;
    int j1 = 9;
    double aw1 = (double)k1/j1; //연산형태의 자료형 또한 있는 코드
    System.out.println(aw1);
    
   
    
	}

}
