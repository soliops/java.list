import java.io.FileReader;
import java.io.IOException;

public class file1 {
	/*
	 * I/O : InputStream, OutputStream 
	 * 입력 스트림 : 프로그램으로 들어오는 스트림 (InputStream : 키보드, 마우스, HDD) 
	 * 출력 스트림 : 프로그램에서 밖으로 나가는 스트림 (OutputStream : 모니터, HDD, 프린터) Stream :
	 * input, output 사용자 처리 
	 * JAVA.io (API) File, FileReader (일반) -> StreamAPI
	 * (FileinputStream) FileWriter -> StreamAPI (FileOutputStream)
	 */

	public static void main(String[] args) throws IOException, Exception {

		/*
		 * FileReader : 
		 * 1. 문자 데이터를 파일로부터 읽는 클래스q 
		 * 2. 파일 이름을 생성자 인수값(파라미터)로 사용해서
		 * FileReader 객체를 생성함.
		 */
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt");
			String a = "a1";
			tests(a);
		} catch (IOException z) {
			System.out.println(z.getMessage());
		} catch (Exception z1) {
			System.out.println(z1.getMessage());
		}
	}

	static public void tests(String data) throws IOException, Exception {
		int k = Integer.parseInt(data);
		IOException ex = new IOException();
		throw ex;

	}
}