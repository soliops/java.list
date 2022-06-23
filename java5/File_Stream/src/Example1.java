import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/*
응용문제
해당 사용자가 영화제목을 검색합니다.
해당 영화제목에 맞는 데이터 값이 있을 경우
영화 전체에 대한 정보를 출력하게 됩니다.
힌트 : Scanner 사용
"검색할 영화제목을 입력하세요." 범죄도시2
[범죄도시] - 추천5 2022년 4월 개봉

"검색할 영화제목을 입력하세요." 뽀로로
검색한 영화는 확인 되지 않습니다.
*/
public class Example1 {

	public static void main(String[] args) throws IOException{
		try {
			//파일로드 및 메소드 전달
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 개봉영화 2. 개봉예정영화 : ");
			int user = sc.nextInt();
			if(user ==1) {
				movie m = new movie("movie_db.txt");
				System.out.println(m);
			}
			else if(user ==2) {
				System.out.println("서비스 준비중 입니다.");
			}
			sc.close();
//			else if(user ==2) {
//				movie m = new movie("movie_expetdb.txt");
//			}

		}
		catch (Exception k) {
			if(k.getMessage()!=null) {
			System.out.println("현재 서비스가 정상적이지 않습니다.");
			}
		}	
	}

}

class movie{
	//보조 클래스
	private String path = "C:\\java5\\File_Stream\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;
	public movie (String filename) throws IOException{
		try {
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.custom();
			this.fr.close();
			this.bf.close();
			this.search();
			
		}
		catch (Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
				}
		}
	}
	public void custom() throws IOException{
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		String datas = this.bf.readLine();
		//do-while문이면 데이터를 하나 먼저 넣고 돌려야한다.
		do{
			this.list.add(datas);
		}while((datas=this.bf.readLine())!=null);
		
	}
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화제목을 입력하세요. : ");
		//indexOf, contains
		String subject = this.sc.next().intern();
		Boolean call = false;
		if(subject == "종료") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb : this.list) {
			//if(moviesb.indexOf(subject)!=-1	
			if(moviesb.contains(subject)) {
				System.out.println(moviesb);
				call= true;
			}
		}
		if(call==false) {
			System.out.println("데이터를 확인할 수 없습니다.");
		}
//		sc.close();
		this.search();//재귀함수
		
	}
}