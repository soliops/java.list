import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY�� MM�� dd��");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		//format : �԰�ȭ�� ���·� ���� ǥ���Ҷ� ����ϰ� �˴ϴ�.
		//for������ f+2�̸� 2�� �����Ѵ�.  ++ �� +1�� �ٿ��� ǥ���� ��
		
		int f,ff,total;
		for(f=1;f<=3;f++) {
		 //System.out.println(f);
		 for(ff=1;ff<=4;ff++) {
			 total=f+ff;
			 //System.out.println(ff);
			 System.out.println(f+ "+"+ff);
		 }
		}
		
		
		
		}

}
