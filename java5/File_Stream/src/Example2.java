import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Example2 {

	public static void main(String[] args) throws IOException {
		/*http://mekeyace.dothome.co.kr/info.txt
		 * �ش� ������ �� ������ �� ������Ȳ�� ������ �������Դϴ�
		 * �ش� ������ �� 100 �̸��� ������ ���� �︸
		 * 20220623.txt ���Ϸ� ������ ����ǵ��� �Ͻʽÿ�.
		 * */
		try {
			String filenames = "water.txt";
			load ld = new load();
			ld.datafile(filenames);
		} catch (Exception e) {
			
		}
	}

}
class load{
	private String path ="C:\\java5\\File_Stream\\src\\";
	private FileReader fr = null;
	public void datafile (String filename) throws IOException {
		this.fr = new FileReader(this.path+filename);
		this.custom();
		this.fr.close();
	}
	public void custom() {
		
	}
}
class create{
	
}