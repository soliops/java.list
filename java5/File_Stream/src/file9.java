import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//Reader(�ֻ���)
//(����) BufferedReader, FileReader, CharArrayReader -�������� ASCII
//(����) InputStreamReader - �̹���, ������, �����
import java.nio.charset.Charset;

//InputStream(�Է�)
public class file9 {

	public static void main(String[] args) throws IOException{
		//Stream : �̹���, ������, ����� ���� ������ �ε��ϱ� ���ؼ�(���̳ʸ�)
		//InputStream : �Է���ġ�� ���� ���� �޴� Ŭ���� �Դϴ�. �⺻(int)   -ASCII
		//InputStream(�ֻ��� �Է���ġ)
		//-(���� Ŭ����) FileInputStream, AudioInputStream, ObjectInputStream
		
		InputStream is = new InputStream() { //�⺻ Ŭ������ �ε��Ͽ� �������� �޼ҵ�
			@Override
			public int read() throws IOException{//byte 1~2 1024 1000
//				int a =15;
				return 0;
			}
			
		};
		//InputStreamReader (�����Ŷ ����)
		//InputStreamReader ("���ϸ�",EUCKR) or InputStreamReader("���ϸ�",UTF8)
	
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
		try {
		System.out.println(ir.read());
		}
		catch (Exception z) {
				System.out.println(z);
		}
		//Ű���尪 �ε�
		InputStream user = System.in;
		try {
		int code = user.read(); //Ű���� �Է� ASCII �ڵ尪�� ��ȯ
		if(code == 13) {
			System.out.println("����Ű�� ����Ͻ� �� �����ϴ�.");
		}
		System.out.println(code);
		}
		catch (Exception z) {
		}
	}

}
