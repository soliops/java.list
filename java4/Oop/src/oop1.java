import java.util.Scanner;

public class oop1 {
/*OOP: 객체지향 프로그래밍 
[캡슐화+은닉화]
public, private, protected, [getter, setter](간접적으로 접근)
[추상화] - abstraction
코드를 정형화
개별적인 메소드를 막음
확장성(interface)
추상 클래스 + interface

[다향성]-overriding, overloading
overriding - 부모의 메소드, 변수 상속
overloading - 자식 클래스에서 메소드를 상속은 받지만 커스텀

[상속성,재사용] - extend(부모+자식), implement(부모 다수 + 자식)
재사용-재귀함수, interface를 다른 class에서도 재사용

[Thread]

[Multi Thread]

Package 관련

Timeloop try, catch

Arrays

동기화, 비동기화
 */
	public static void main(String[] args) {
		// 재귀메소드 사용법
		op_method om = new op_method();
		System.out.println(om);
		
	}

}
/*
	재귀메소드 : 메소드를 직접 또는 간접으로 호출 하는 프로세서를 말합니다.
	반복문, 외부 class를 재실행 등 복잡한 문제를 쉽게 해결 하기 위해서
	구현하는 메소드 형태를 말합니다.
 */
class op_method{
	Scanner sc = new Scanner(System.in);
	public op_method(){   //최초 실행 메소드
		this.m1();
	}
	private String nm;
		public void m1 () { //메소드 m1 실행
		System.out.println("찾을 이름을 입력하세요?");
		this.nm = sc.next();
		this.m2();
	}
	public void m2 () { //m1에 대한 결과값을 m2가 확인
		if(this.nm.equals("홍길동")) {
			sc.close();
			System.exit(0);
		}else {
			System.out.println("해당 이름은 없습니다.");
			this.m1(); //m1을 다시 재 호출 재귀메소드 (재귀메소드)
		}
	}
}