import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;


//OutputSream (output)
//(����)FileOutputStream, ObjectOutputStream, AudioOutputStream
public class file10 {
	public static void main(String[] args) {
		
//		String a = "ȫ�浿"; // ����
		String a = "12345678";
		//byte[] : ���ڿ��� ASCIIŰ ������ �迭�� ���� �� �� ���
		byte[] b = a.getBytes();//getBytes("�����Ŷ") �޼ҵ�
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out; //��¸� ��� System.out.print ����
		
		try {
		os.write(b,0,b.length);
		//(byte�迭�̸�, �迭��ȣ, �迭ũ��)
		os.flush(); //��� ��Ʈ
	}
		catch (Exception e) {
			}
	}

}
