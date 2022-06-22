import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner를 이용한 파일 쓰기 사용법(input)
public class file6 {

	public static void main(String[] args) throws IOException {
		try {
		FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\db.txt");
		//true 쓰면 초기화되지 않고 기존 내용이 계속 남아있음
		Scanner sc = new Scanner(System.in); //사용자 직접 입력
		System.out.println("내용을 입력해주세요:");
		for(int a=0;a<3;a++) { //3번 반복
		String notice = sc.nextLine()+"\r\n";//\n으로
		fw.write(notice); //해당 입력사항을 db.txt에 저장시킴
		}
		sc.close();
		fw.close();
		}
		catch (Exception z) {
			System.out.println(z);
		}
	}

}
