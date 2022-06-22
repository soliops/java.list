import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7에 대한 추가 설명 BufferedReader+Array (output ->input -> output)
public class Buffer_array {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> ar = new ArrayList<>(); //빈 배열 class
		String word = "";
		while((word=br.readLine())!=null) { //버퍼에 있는 값을 String 자료형으로 이전 후
			ar.add(word); // 해당 자료형에 저장된 문자를 배열로 추가시킴
		}
		System.out.println(ar);
		System.out.print(ar.size());
	}

}
