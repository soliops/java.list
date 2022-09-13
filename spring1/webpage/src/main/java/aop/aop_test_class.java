package aop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class aop_test_class {
	private String name;
	private int point;
	private String user;
	private String money;

	public String message(String user,String money) {
		this.user=user;
		this.money=money;
		String msg= this.user+"님의 포인트는 "+this.money+" 입니다.";
		return msg;
	}
}
