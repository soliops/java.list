import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.LineNumberReader;
import java.nio.Buffer;
import java.nio.charset.Charset;

import javax.swing.ButtonGroup;
/*�����ɾ� ���� : read(),readLine(), next(),nextLIne()*/
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOError{
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));			
//			System.out.println((char)fr.read());
			//BufferedReader : Temp(�ӽ������) - ȿ�������� ������ ���� ������ ������ �� �ֽ��ϴ�.
			BufferedReader bf = new BufferedReader(fr); //readLine()���� �ش簪�� Ȯ���մϴ�.
//			System.out.println(bf.readLine());
			//�ش� �ӽ�����ҿ��� ������ ������ �Ѱ��� �������� �ε��ϰ� �˴ϴ�.
			/*Buffer�� ���� ���� ����Ͽ��� ���
			 * ������ ���� ������ ���� ����ϰ� �˴ϴ�.*/
	
			/*���ǹ� ���ÿ��� �ѹ� �۵��� �̷�����Ե˴ϴ�.*/
//			if(bf.readLine()!=null) {
//				System.out.println(bf.readLine());
//			}
			/*
			int w= 0;
			while(w<=0) {
				String data = bf.readLine();
				System.out.println(data);
//				System.out.println(bf.readLine());
			w++;
			}
			*/
			/*buffer�� �ӵ��� ���� ��� ��� �κп� ������ ���� �Ǵ� �迭�� 
			 ���� �� ����ϴ� ���� �����մϴ�.*/
			String line = "";
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			
			/*�����͹����� ���ΰ����� Ȯ��*/
			/*LineNumberReader : ���� ��ü ���� ������ Ȯ���ϴ� Ŭ���� �Դϴ�. */
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));		
			LineNumberReader li = new LineNumberReader(fr2);
			int ea = 0;
			while((li.readLine())!=null) {
				ea = li.getLineNumber();
			}
			System.out.println(ea);
			bf.close();

		}
		catch (Exception z) {
		System.out.println(z);
		}
	}

}
