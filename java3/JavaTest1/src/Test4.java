import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է����ּ���?");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
		}else {
			int w=1;
			int total;
			do {
				total=num*w;
				System.out.println(num+"*"+w+"="+total);
				w++;
			}while(w<=9);
		}
		sc.close();
	}

}
