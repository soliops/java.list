import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {

       Scanner a = new Scanner(System.in);
       System.out.println("입력할 내용을 적어주세요!");
       //String memo = a.next();
      
       String memo = a.nextLine();
      
       // next() : 스페이스바 입력까지만 적용
       // nextline() : 스페이스바를 포함 모두 적용
       
       System.out.println(memo);
		
       
       a.close();  //scanner 종료를 기본으로 적용 해주어야 합니다.
       
       
      String mid = "park";  // String +숫자 - %s
      int age = 25;         // 숫자는 %d
      /* 중요사항 
       * %f : float, double
         %t : date, time 시간, 날짜
         %b : boolean (true, false)
       */
      
      //System.out.println(mid+"님의 나이는"+age+"입니다.");
      //printf : f라는 뜻이 format을 뜻합니다.
		System.out.printf("%s님의 나이는 %d입니다.",mid,age);
		
		
	
	}

}
