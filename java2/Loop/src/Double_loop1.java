import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY년 MM월 dd일");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		//format : 규격화된 형태로 값을 표현할때 사용하게 됩니다.
		//for문에서 f+2이면 2씩 증가한다.  ++ 는 +1를 줄여서 표현한 것
		
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
