
import java.util.Arrays;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/* 
		 ���� ����� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		 ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 "1~46 �� ������ ���ڸ� �Է��� �ּ���:"
		 ����ڰ� �Է��� 5���� ���ڸ� �迭�� �����մϴ�.(main���� ó��)
		 
		 �ܺ� class�� �̿��Ͽ� PC�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 PC�� ���� 5���� ���ڸ� �迭�� �����մϴ�.(�ܺ� class method�� ����)
		 
		 ������ ��� method�� �ϳ� �� �����Ͽ�
		 ����ڰ� �Է��� 5���� �迭 �����Ϳ� PC�� ���� �迭 �����͸�
		 �ش� method�� �����Ͽ�, ����Ͻø� �˴ϴ�.
		 
		 ��, ��� ����ϴ� �ݺ����� ������ do-while������ �ۼ��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int w= 0;
		int user[] = new int[5];
		do {
			System.out.println("1~46 �� ������ ���ڸ� �Է��� �ּ���:");
			int input = sc.nextInt();
			user[w]= input;
	
			w++;
		}while(w<5);
		sc.close();
		//System.out.println(Arrays.toString(user));
	
		Lotto a = new Lotto();
		a.pcprint(user);
		
	}
		
	}
	class Lotto {
		public void pcprint(int usernum[]) { //pc��� ���
			int pcnum[]=new int[5];
			int ww=0;
			do {
				int pc =(int) (Math.random()*46+1);
				pcnum[ww]=pc;
				ww++;
			}while(ww<5);
			//System.out.println(Arrays.toString(pcnum));
			Lotto b = new Lotto();
			b.print(usernum,pcnum);
		}
		public void print(int usernum2[],int pcnum1[]) {  //�����, pc�����
			System.out.println(Arrays.toString(usernum2));
			System.out.println(Arrays.toString(pcnum1));
		}
	}