import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//crawling ���
public class net3 {

	public static void main(String[] args) throws IOException {
		String url ="http://www.jogunshop.co.kr/index.html";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
		System.out.println(urls.getProtocol()); //�������� http, https
		System.out.println(urls.getPort()); //��Ʈ��ȣ
		System.out.println(urls.getFile()); //���� ���ϸ�
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		FileWriter write = new FileWriter("login.html");
//		FileOutputStream fs = new FileOutputStream("login.html");
		byte html[] = new byte[1024];
		String str = "";
		while((str=br.readLine())!=null) {
//			fs.write(html,0,size);
			write.write(str);
		}
		br.close();
//		fs.flush();
//		fs.close();
		
	}

}
