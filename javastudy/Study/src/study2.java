import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {		
		//test 2-1
		userinputnum uin = new userinputnum();
//		uin.userinput();
//		System.out.println(uin.result());
//		test2-2
		Scanner sc2 = new Scanner(System.in);
		String user = sc2.next().intern();
		userlist ul = new userlist();
		ul.search(user);
		sc2.close();
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
		sc.close();
	}
	public int result() {
		return this.total;
	}
}
class userlist{
	public String[] users = { "������", "�ǿ�ȯ", "�ݻ���", "�赿��", "�����", "������", "����ȣ", "����" };
	public String msg[] = { "�ش� ����ڰ� �ֽ��ϴ�.", "�ش� ����ڴ� ���Ե��� �ʾҽ��ϴ�." };

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