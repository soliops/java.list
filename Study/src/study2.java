import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {		
		//test 2-1 8회 숫자 입력 계산 문제
		userinputnum uin = new userinputnum();
		uin.userinput();
		System.out.println(uin.result());
//		test2-2 //문자배열에서 검색 일치 문제
//		Scanner sc2 = new Scanner(System.in);
//		String user = sc2.next().intern();
//		userlist ul = new userlist();
//		ul.search(user);
//		sc2.close();
	}
}
class userinputnum{
	int total = 0;	
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		for(int f=1; f<9; f++) {
			int num = sc.nextInt();
			this.total+=num;
		}
		this.result();
//		sc.close();
	}
	public int result() {
		return this.total;
	}
}
class userlist{
	public String[] users = { "강보경", "권용환", "금새록", "김동주", "김민재", "성유리", "손진호", "안희성" };
	public String msg[] = { "해당 사용자가 있습니다.", "해당 사용자는 가입되지 않았습니다." };

	public void search(String user) {
		String msg1 = null;
		int ff = 0;

		while (ff < users.length) {
			if (user == users[ff]) {
				msg1 = this.msg[0];
				break;
			} else {
				msg1 = this.msg[1];
			}
			ff++;
		}
		System.out.println(msg1);
	}
}