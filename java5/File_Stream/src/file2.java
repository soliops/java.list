import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException {
		try {
//			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt");
		//8번대에서 쓰던것
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt",Charset.forName("UTF8"));
		//Charset.forName : JAVA12 -> EUCKR(ANSI), UTF8, UTF16
//		System.out.println(fr.getEncoding()); //인코더 형식을 확인 FileReader
//		System.out.println(fr.read());  //데이터 크기
		while(true) {//loop를 활용하여 해당 파일에 문자를 모두 가져옴
			int m = fr.read(); // -1 : 내용이 없음 (더 이상 문자가 없을 경우)
			System.out.print((char)m);
			if(m==-1) {//더 이상 가져올 문자가 없을 경우 loop 빠져나감
				break;
			}	
			
		}
		fr.close();//FileReader 를 종료함.
		}
		catch(IOException e){
			if(e.getMessage()==null) {
				System.out.println(e);
			}
		}
	}

}
