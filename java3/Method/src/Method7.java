import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		
		apink ap = new apink("ȫ�浿",25,"test@gmail.com",-1000);
		System.out.println(ap.data());
		System.out.println(ap.data2());
		System.out.println(ap.data3());
//		ap.names();
		
	//	apink("ȫ�浿",25,"test@test.com",1000);
		
		
		
		
		
	}

}
class apink{    
	//private ������ class �ʵ忡�� �����ؾ� �մϴ�.
	//String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
		if(this.nm=="ȫ�浿") {
		this.nm = "hong";
		String e[] = this.email.split("@");
		//�̸��� �߿� �̸��� ȸ�� ������ �������� ���� �迭�� ������ �۾�
//		System.out.println(Arrays.toString(e));
		this.email_cp = e[1];
		}
		
	}
	

	//String nm1, int age2, String email3, int point4
	public apink (String nm1, int age2, String email3, int point4) { 
		//private�� �ȿ��� ������� ����.
	//setter ����
	this.nm =nm1;
	this.email = email3;
	if(point4<0) {
		this.point = 0;
	}
	else {
		this.point=point4;
	}
	}
	public String data() {
		 
		names();
		return this.nm;  /// return�� �� �������� ����ϴ� �ڵ� �Դϴ�.
		//return �ؿ� �ڵ�� ��� ������ �߻��ϰ� �˴ϴ�.
	}
	public String data2() {
		//getter ����
		return this.email_cp;
	}
	public int data3() {
		return this.point;
	}
}