
public class Test2 {

	public static void main(String[] args) {		
		int score = 89;
		String msg;
		if(score>=90) {
			msg="��� A �Դϴ�.";
		}else if(score>=70) { //&& score<=89 ������ �� ��Ȯ�� ����� �ϱ� ����.
			msg="��� B �Դϴ�.";
		}else if(score>=50) {//&& score<=69
			msg="��� C �Դϴ�.";
		}else{
			msg="�Ϲ� ��� �Դϴ�.";
		}
		System.out.println(msg);		
	}

}
