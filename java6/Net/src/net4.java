import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//크롤링2
public class net4 {

	public static void main(String[] args) throws Exception {
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		/*Stream을 사용하면 read만 사용(byte이용), Reader readLine(String)
		  flush() 사용형태 BufferedOutputStream
		*/
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is); //배열byte[]
		byte html[] = new byte[1024];
//		FileOutputStream fs = new FileOutputStream("game.html");//배열 값 로드해서 저장
		BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html"));
		int s = 0;
		while((s=bs.read(html))!=-1){ //Stream은 read에 byte배열명을 입력
			fs.write(html,0,s);
		}
		fs.flush();
		is.close();
		bs.close();
		fs.close();
	}

}
