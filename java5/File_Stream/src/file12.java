import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//FileOutputStream
public class file12 {

	public static void main(String[] args) throws IOException{
		String test = "�����Դϴ�.";
		String path= "C:\\java5\\File_Stream\\src\\";
		OutputStream os = new FileOutputStream(path+"array.txt");
		byte[] data = test.getBytes(); //���ڸ� ->ASCII ��ȯ
		os.write(data);
		os.flush(); 
		//Stream�� ����� ��� ���� �޸𸮿� �ְ� �˴ϴ�.
		//flush()�޸� ���� ��� ���� �۾��� �ϰ� �˴ϴ�.
	}

}
