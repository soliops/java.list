import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//Reader(최상위)
//(하위) BufferedReader, FileReader, CharArrayReader -문서파일 ASCII
//(하위) InputStreamReader - 이미지, 동영상, 오디오
import java.nio.charset.Charset;

//InputStream(입력)
public class file9 {

	public static void main(String[] args) throws IOException{
		//Stream : 이미지, 동영상, 오디오 같은 파일을 로드하기 위해서(바이너리)
		//InputStream : 입력장치에 대한 값을 받는 클래스 입니다. 기본(int)   -ASCII
		//InputStream(최상위 입력장치)
		//-(하위 클래스) FileInputStream, AudioInputStream, ObjectInputStream
		
		InputStream is = new InputStream() { //기본 클래스를 로드하여 오버라이 메소드
			@Override
			public int read() throws IOException{//byte 1~2 1024 1000
//				int a =15;
				return 0;
			}
			
		};
		//InputStreamReader (언어패킷 변경)
		//InputStreamReader ("파일명",EUCKR) or InputStreamReader("파일명",UTF8)
	
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
		try {
		System.out.println(ir.read());
		}
		catch (Exception z) {
				System.out.println(z);
		}
		//키보드값 로드
		InputStream user = System.in;
		try {
		int code = user.read(); //키보드 입력 ASCII 코드값을 반환
		if(code == 13) {
			System.out.println("엔터키는 사용하실 수 없습니다.");
		}
		System.out.println(code);
		}
		catch (Exception z) {
		}
	}

}
