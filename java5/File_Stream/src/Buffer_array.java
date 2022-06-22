import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7�� ���� �߰� ���� BufferedReader+Array (output ->input -> output)
public class Buffer_array {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> ar = new ArrayList<>(); //�� �迭 class
		String word = "";
		while((word=br.readLine())!=null) { //���ۿ� �ִ� ���� String �ڷ������� ���� ��
			ar.add(word); // �ش� �ڷ����� ����� ���ڸ� �迭�� �߰���Ŵ
		}
		System.out.println(ar);
		System.out.print(ar.size());
	}

}
