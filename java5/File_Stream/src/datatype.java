import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		//intern() = equals�� ������� �ʰ� ==(�ε��ȣ�� ��밡��)
		String data[] = {"ȫ�浿"};
		String data2[] = {"ȫ�浿","ȫ�浿"};
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern();
		String d = new String("ȫ�浿");
		String e = data[0];
//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();
		String g = new String(a);
		String h = new String(data2[0]).intern();
		String h2 = new String(data2[1]).intern();
		String h3= new String(data2[1]).intern();
		String h4 = new String(data2[0]);

		System.out.println(h4==h3);
		/* String Pool ������ ���� ������ 
		 ==, equals
		 String Pool ����, HEAP����
		 equals
		 HEAP ���� �ִ� ��� ��
		 equals
		 
		 **intern => String Pool �������� �ִٰ� �����ϰ� ����.
		 */
			
		//new String : �Ҽ��� ���� �����й��� �ڷ���(����, �迭��)
//		if(c==e) {
//			System.out.println("���� �����ϴ�.");
//		}
		
	}

}
