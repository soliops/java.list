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
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\movie_db.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> list = new ArrayList<String>();
		String words = "";
		while((words=br.readLine())!=null) {
			list.add(words);
			
		}
		try {
		Scanner sc = new Scanner(System.in);
		int w= 0;
		System.out.println(list.size());
		System.out.println(list.get(w));
		do {
			System.out.println("검색할 영화제목을 입력하세요.");
			String search = sc.next();
			String ob = list.toString();
			System.out.println(ob);
			boolean b = list.get(w).contains(search);
			System.out.println(b);
			if(ob.toString().contains(search)) {
				System.out.println(list.get(w));
				break;
			}else if(!ob.toString().contains(search)){
				System.out.println("검색한 영화는 확인 되지 않습니다.");
			}
			w++;
		}while(w<list.size());
			sc.close();
			br.close();
			fr.close();
		}
		catch (Exception e) {
			if(e.getMessage()!=null) {
			System.out.println(e.getMessage());
			}
		}	
	}

}
