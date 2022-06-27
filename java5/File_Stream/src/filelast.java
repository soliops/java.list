import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	InputStream > InputStreamReader > BufferedReader �ùٸ� ���(O)
	InputStream > BufferedReader (X)
	InputStream > BufferedInputStream (O)
	InputStreamReader > BufferedReader (O)
	
	BufferedReader - close() �޸� ����, BufferedWriter -flush() �޸𸮸� �ʱ�ȭ + close(); 
*/ 
public class filelast {

	public static void main(String[] args) throws IOException{
		try {
		String url = "src\\movie_db.txt";
		FileInputStream fs = new FileInputStream(url);
//		BufferedInputStream bs = new BufferedInputStream(fs);
//		byte a[] = new byte[400];
		
		InputStreamReader ir = new InputStreamReader(fs,"UTF-8");
		BufferedReader br = new BufferedReader(ir);
		System.out.println(br.readLine());
//		System.out.println(fs.read(a));
		br.close();
		}
		catch (Exception e) {
		
		}
	}

}
