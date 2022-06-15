import java.util.Arrays;

public class example5 {
	
	public static void main(String[] args) {
		/*
		 * 2차배열 + 기본(클래스) 메소드 문제
		 * 등록된 고객 중 vip 고객만 리스트를 출력하시오.
		 * user_list: 홍길동, 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_level: gold vip guest gold vip vip guest
		 * 결과 출력 : 이순신, 세종대왕, 김유신,
		 * 
		 */
		
		
		String user[][]= {
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"gold","vip","guest","gold","vip","vip","guest"}
		};
		
		example5 ex = new example5();
		
		ex.user_lists(user);
		
	}
	public void user_lists(String ulist[][]) {
		int gp = ulist.length;
		int ea = ulist[0].length;
		int w=0;
		/*
		int ct=0;
		String mname[] = new String[ea];
		do {
				if(ulist[1][w].equals("vip")) {
				
					mname[ct]=ulist[0][w];
			ct++;
				}
			w++;
		}while(w<ea);
		System.out.println(Arrays.toString(mname));
		*/
		while(w<gp) {
			int ww=0;
			while(ww<ea){
				if(ulist[w][ww].equals("vip")) {
					System.out.println(ulist[0][ww]);
					
				}
			
				ww++;
			}
			w++;
		}
		
		
		
		
		
	}
}
