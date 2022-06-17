
public class Class2 {

	public static void main(String[] args) {
		/*
		 응용문제
		 더블 클래스를 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하시오.
		 클래스는 2가지 있습니다.
		 부모 클래스 명은 : mother 
		 자식 클래스 명은 : child
		 메인 클래스에서 mother 클래스로 값을 전달 
		 값은 30 50 숫자값을 적용합니다.
		 child에서 부모 클래스에 있는 값을 받아
		 두 개의 숫자를 곱한 결과값을 출력하시오.
		 */
		mother m = new mother();
		int num1 = 30;
		int num2 = 50;
		m.m_method(num1,num2);
		mother.child mc = m.new child(); 
		mc.c_method();
		
	}
}
class mother {
	int m_num1;
	int m_num2;
	public void m_method(int num1,int num2) {
		this.m_num1 =num1;
		this.m_num2 =num2;
			}
	class child{ //결과 출력
		int c_num1 =mother.this.m_num1;
		int c_num2 =mother.this.m_num2;
		public void c_method(){
			//int c_sum = mother.this.m_num1*mother.this.m_num2;
			int c_sum = c_num1 *c_num2;
			System.out.println(c_sum);
		}
	}
}