
public class Example4 {

	public static void main(String[] args) {
		/*
		 응용문제
		 두개의 값을 외부 클래스로 보냅니다.
		 해당 클래스에서 두개의 값을 계산하게 됩니다.
		 계산형식 다음과 같습니다.
		 3,10을 보내게 되면 두개의 값을 합을 구합니다.
		 나머지 외부 클래스에서 결과값을 출력하는데,
		 두개의 합 값이 짝수, 홀수 인지를 출력하는 extends를 구현하세요.
		 */
		int v1=10;
		int v2=3;
		result rt = new result();
		rt.plus(v1,v2);
		rt.print();
	}

}

class total{
private int num;
private int num2;
protected int total;
public String msg[]= {"짝수","홀수"};
 	public void plus (int a, int b) {
 		this.num = a;
 		this.num2 = b;
 		this.total = this.num+this.num2;
 		
 	}
}
class result extends total {
	public void print() {
		if(this.total%2==0) {
			System.out.println(msg[0]);
		}
		else {
			System.out.println(msg[1]);
		}
	} 
}
