import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class study4 {

	public static void main(String[] args) {
		scan sn = new scan();
		sn.scanpro();
		
	}

}
class scan{
	Map<String,String> words = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	int num=0;
	String en = null;
	String ko = null;
	String wo = null;
	String longword ="";
	public void scanpro() {
		
		System.out.println("1.입력 2.검색 3.가장 긴 단어찾기 4.종료");
		this.num = sc.nextInt();
		if(this.num==1) {
			this.input();
		}
		else if(this.num==2) {
			this.search();
		}
		else if(this.num==3) {
			this.word();
		}else if(this.num==4) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
	}
	public void input() {
		System.out.println("1.입력입니다.");
		System.out.println("영어 단어 : ");
		this.en = this.sc.next();
		System.out.println("한국어 : ");
		this.ko = this.sc.next();
		this.words.put(this.en, this.ko);
		this.words.put(this.ko, this.en);
		this.scanpro();
	}
	public void search() {
		System.out.println("2.검색입니다.");
		this.wo = this.sc.next();
		if(this.words.get(this.wo)!=null) {
			System.out.println(this.words.get(this.wo));
		}
		else if(this.words.get(this.wo)!=null){
			System.out.println(this.words.get(this.wo));
		}
		else {
			System.out.println("정확한 단어를 입력해주세요!!");
		}
			this.search();
		this.scanpro();
	}
	public void word() {
		System.out.println("3.가장 긴 단어 찾기입니다.");
			ArrayList<String> wdata = new ArrayList<>();
			Set<String>keys = this.words.keySet();
			Iterator<String> itr = keys.iterator();
			int max =0;
			while(itr.hasNext()) {
				String key1 = itr.next();
				key1 = key1.replaceAll("[^a-zA-Z]", "");
				wdata.add(key1);
//				int count = key1.length();
//				if(count>max) {
//					this.longword =key1;
//				}
			}
			System.out.println(wdata);
			String key[] = new String[this.words.size()];
//			System.out.println(key1);
//			System.out.println(this.longword);
			
	}
}