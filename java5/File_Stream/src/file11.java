import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


//Stream�� �̿��� ���� �ε�
public class file11 {

	public static void main(String[] args) throws IOException {
		try {
		InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
//		FileInputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
//		System.out.println(is.available()); //available : ���� ��ü ũ��
		byte temp[] = new byte[is.available()];
		//������ �뷮 �迭 ���� (���� ũ�⿡ ���� ������ �ְ� ����)
		int ea = is.read(temp);
		System.out.println(ea);
		String data = new String(temp,"UTF8");
		System.out.println(data);
		/*
		byte temp[] = new byte[1024*16]; //1024*16 �ش� ����ũ�⸦ ������ �� ����
		int ea = is.read(temp);	//ASCII �ڵ�� ��ü�� �о ea�� �޵���
		String data = new String(temp,"UTF8"); 
		// String �������·� �迭�� �޾Ƽ� ���
		System.out.println(data);
		*/
		is.close();
		}
		catch (Exception e) {
			
		}
		
		
		
	}

}
