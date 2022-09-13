package aop;

//@Getter
//@Setter
public class aop_class2 {
	//bean.xml에서 name값과 동일
	private String box1;
	private String box2;
	
	public String getBox1() {
		return box1;
	}
	//set으로 시작하는 메소드는 bean.xml에 value값을 받아서 처리함
	public void setBox1(String box1) {
		this.box1 = box1;
	}
	public String getBox2() {
		return box2;
	}
	public void setBox2(String box2) {
		this.box2 = box2;
	}
}
