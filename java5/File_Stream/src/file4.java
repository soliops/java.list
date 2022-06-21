import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

//파일 쓰기 (Write)
public class file4 {

	public static void main(String[] args) throws IOException, Exception {
		
		try {
			//FileWriter : 문자 데이터를 파일에 쓰는 Class
			String user[] = {"홍길동40","김유신60","강감찬100","유관순300"};
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");
//			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			//FileWriter true를 사용하면 기존 입력된 사항을 초기화 하지 않음
			//Charset.forName("UTF8")
			
			for(int f=0;f<(user.length);f++) {
				System.out.println(user[f]);
				fw.write(user[f]); //write : 문자, 배열 데이터 값을 파일에 적용함
			}
			fw.close(); //파일 오픈사항을 종료 하여 적용합니다.
		}
		catch (Exception x) {
			System.out.println("test");
		} 
		
	}

}
