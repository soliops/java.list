import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

//���� ���� (Write)
public class file4 {

	public static void main(String[] args) throws IOException, Exception {
		
		try {
			//FileWriter : ���� �����͸� ���Ͽ� ���� Class
			String user[] = {"ȫ�浿40","������60","������100","������300"};
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");
//			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			//FileWriter true�� ����ϸ� ���� �Էµ� ������ �ʱ�ȭ ���� ����
			//Charset.forName("UTF8")
			
			for(int f=0;f<(user.length);f++) {
				System.out.println(user[f]);
				fw.write(user[f]); //write : ����, �迭 ������ ���� ���Ͽ� ������
			}
			fw.close(); //���� ���»����� ���� �Ͽ� �����մϴ�.
		}
		catch (Exception x) {
			System.out.println("test");
		} 
		
	}

}
