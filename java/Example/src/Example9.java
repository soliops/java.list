import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		/*
		 * 응용문제 9 A학생에 대한 성적을 입력받고 평균점수가 나오는 프로그램을 제작합니다. 
		 * "점수를 입력하세요?"라는 문구는 총 5번이 나오게 되며, 모든 점수는 합산한 후 5개의 점수에 대한 평균값을 출력합니다.
		 * "해당 점수의 평점은: " 출력
		 * 단, 평점 점수가 40점 이하일 경우 "재시험입니다." 라고 메세지를 출력 후 프로세서는 종료합니다.
		 * 40점 이상일 경우 "합격"이라고 메세지를 출력 하십시오. 
		 [추가기획]
		 "입력하실 과목 수를 적어주세요:" 라고 제일 먼저 출력 후 해당 과목 수만큼 반복문이 적용이 되며, 
		 과목 수 만큼 평균값이 적용되어야 합니다.
		 * do-while문
		 */ 

		Scanner sc = new Scanner(System.in);
		String msg = "점수를 입력하세요?";
		int number=1;
		int total = 0;
		
		System.out.println("입력하실 과목 수를 적어주세요:");
		    int user2=sc.nextInt();
		do {
			System.out.println(msg);
			int user = sc.nextInt();
			total += user;
			number++;
		} while (number <= user2);
		System.out.printf("총 합계 : %d점", total);
		
		double ave= (double)(total)/user2; //평균계산
		String msg2;
		
		
		if(ave<=40) {
			msg2 ="재시험입니다.";
			System.out.println(msg2);
			}else {
				msg2 ="합격";
				System.out.println(msg2);
			}
		System.out.println("/해당 점수의 평점은:"+ave+"점 "+msg2);
		
		sc.close();
		
	}

}
