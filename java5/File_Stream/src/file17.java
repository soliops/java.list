import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//bufferedWriter
//Bufferd : read, writer 단독으로 사용은 하지 않음.
public class file17 {

	public static void main(String[] args) throws IOException {
		try {
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os);
		bw.write("홍길동 입니다.");
		bw.close();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String test = br.readLine();
		System.out.println(test);
		}
		catch (Exception e) {
			
		}
	}

}
