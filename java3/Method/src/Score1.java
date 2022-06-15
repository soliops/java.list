
import java.util.Scanner;

public class Score1 {
	static String[] msg = 
		{"검색할 데이터 학생명을 입력해 주세요?", "검색할 과목명을 입력하세요?[전체,국어,수학,과학,역사]"};
	//gtdata() : return 메소드로 출력
	public static void main(String[] args) { //static이면 private은 로드 불가능
		//사용자 정보 입력 및 결과정보 출력
		/*
		 * 문제[공용프로젝트] 여러명의 점수 데이터가 존재 합니다. 프로그램 실행시 해당 사용자 이름을 입력합니다. 해당 점수 데이터 중 사용자
		 * 이름과 동일한 데이터만 출력 되도록 합니다. [프로세서 실행 결과] 검색할 데이터 학생명을 입력해 주세요? 홍길동
		 * 
		 * 
		 * 검색할 과목 점수? [전체]? 전체 검색데이터 학생명 : 홍길동 점수데이터 : 국어:55 수학:60 과학:77 역사:90 검색할 과목
		 * 점수? [전체]? 수학 검색데이터 학생명 : 홍길동 점수데이터 : 수학:60
		 * 
		 * 배열 데이터값 { {"박은경","이경훈","장운","조기현","김진수"}, {"80","78","92","67","40"},
		 * {"40","80","80","92","100"}, {"95","30","55","90","65"},
		 * {"20","80","100","95","30"} }; A파트 사용자가 해당 질문을 입력할 수 있는 프로세서를 제작하고, 최종 결과 값을
		 * return받아서 처리해야합니다. 단, 해당 데이터에 없는 사용자를 입력할 경우 데이터를 찾지 못했습니다. 라고 입력 되어야 합니다. 또한
		 * 과목을 전체로 입력할 경우 국어~역사까지 모두 출력합니다. 해당 특정 과목을 입력할 경우 해당 과목 점수만 출력되도록 합니다.
		 * 
		 * B파트 A파트에서 전달받은 사용자 입력값 형태에 맞춰서 결과값을 A파트로 다시 재 전달 하시면 됩니다.
		 * 
		 * 
		 * A파트 사용자가 입력하는 값2개 1번 사용자 이름 -> B파트 2번 B파트에서 결과값을 받은후 조건으로 처리하여 2번째 질문 유/무4번
		 * 정상적으로 사용자 이름이 파악 ->검색할 과목명을 입력하세요[전체] 5번 사용자가 최종적으로 이름과 과목명 6번 -A파트 사용자 입력 중
		 * 2가지 모드로 최종 결과를 출력합니다. 8번 전체: 국어data[0],수학data[1],과학data[2],역사data[3] B파트 A파트
		 * 사용자 이름 ->setter ->배열로 검토 -> 사용자 이름 유/무 3번 A파트 사용자 이름, 과목명 -> 코드작성하여 배열값을
		 * 추출(문자열_ 7번 만약 전체 과목 데이터 92,80,55,100 보냅니다 ->A파트 7번(2)
		 */
		Score2 sc = new Score2();
		Scanner text = new Scanner(System.in);
		System.out.println(msg[0]);
		String name = text.next(); //학생명 입력
		sc.stdata(name,null); // Score2에 메소드로 사용자 및 점수 전달
		
		String check = sc.gtdata();
//		System.out.println(check);
//		System.exit(0);
		
		if(check.equals("true")) {
			System.out.println(msg[1]);
			String subject = text.next(); //과목입력
			sc.stdata(name,subject);
			String score =  sc.gtdata(); //결과확인
			
//			System.out.println(score);
//			System.exit(0);
			
			
			if(subject.equals("전체")) {
				String score2[]=score.split(",");
				System.out.printf("점수데이터 : 국어 %s 점, 수학 %s 점, 과학 %s 점, 역사 %s 점",score2[0],score2[1],score2[2],score2[3]);
			}
			else {
				System.out.println("점수데이터는 : "+subject+" "+score+"점");
						
			}
		}
		else {
			System.out.println("해당 사용자는 존재 하지 않습니다.");
			System.exit(0); //0:정상종료 1: 비정상종료
		}
		text.close();
		System.gc();
		
		//System.out.println(sc.gtdata());
	}

}
