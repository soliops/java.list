import java.util.Scanner;

public class study8 {

	public static void main(String[] args) {
		/*���빮��
		 abstract�� �迭
		 ��¼���
		 "�ش� ��ǰ�� ������ �ּ���?[1.���, 2.����, 3.Ű��]"
		 2
		 "�ش� ��ǰ ������ �Է����ּ���?"
		 5
		 "�����Ͻ� �� ������ 7500�� �Դϴ�."
//		 "��ٱ��ϸ� �����Ͻðڽ��ϱ�?"
//		 Y/N
//		 Y
		 
		 */
		
		
	}

}
abstract class original{
	String[] list;	
}
class scanning extends original{
	String[] fruit = {"���=2000","����=1500","Ű��=2500"};
	public void scan() {
	Scanner sc =new Scanner(System.in);
	System.out.println("�ش� ��ǰ�� ������ �ּ���?[1.���, 2.����, 3.Ű��]");
	int num = sc.nextInt();
	System.out.println(this.fruit);
	}
	
}