import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 로드 사용법(output)
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in : input
		//system.out : output
		try {
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt",Charset.forName("UTF8"));
		//System.in(사용자가 직접), FileReader : 파일을 로드
		Scanner sc = new Scanner(fr);
		/*
		for(;;) { //loop시 예외처리로 빠질 수 있음
			String result = sc.nextLine(); //파일로드 된 입력값을 result로 전달
			if(result!=null) {
		System.out.println(result); //출력
			}
			else {break;}
		}
		*/
		int count = 0;
		String result = "";
		//sc.hasNext()
		//(result=sc.nextLine())!=null
		//무한루프
		while(sc.hasNext()) { //hasNext() : true, false
			sc.nextLine();
			count++;
		}
		System.out.println(count);
		sc.close();
		fr.close();
		}
		catch (Exception e) {
//			System.out.println(e);
		}
	}

}
