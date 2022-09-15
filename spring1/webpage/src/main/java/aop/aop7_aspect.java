package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//어노테이션 AOP 사용시 pom.xml에서 
//aspectj, aspectjweaver, aspectjrt가 설치 되어 있어야 합니다.

//AOP를 실행하는 class이며, 어노테이션으로 자동 구분 되도록 합니다.
@Aspect	//xml에서 선언하지 않은 <aspect> 태그 대신 사용하는 구문
public class aop7_aspect {
	//어노테이션은 xml에서 태그 대신 역할을 사용하게 됩니다.
	
	//Around는 무조건 return을 사용해야 합니다.
	@Around("within(aop.aop_class7)")
	//객체 프로그램이 실행 전,후 모두 적용되게 하는 공통 메소드 
	//Throwable : Exception과 동일한 예외처리이며, 예외처리 최상위 클래스 입니다.
	public Object aroundlog(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("AOP AROUND 실행");
		return jp.proceed();
		//proceed클래스는 Thread에서 run 처럼 작동하는 원리 입니다.
	}
	
//	@Before("within(aop.aop_class7)")
//	//객체 프로그램이 실행되기 전에 작동되는 메소드
//	public void beforelog() {
//		System.out.println("AOP BEFORE 실행");
//	}
	
//	@After("within(aop.aop_class7)")
//	//객체 프로그램이 실행하고 나서 작동되는 메소드
//	public void afterlog() {
//		System.out.println("AOP 로그 실행");
//	}
}
