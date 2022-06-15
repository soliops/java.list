import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 응용문제
		 관리자에서 메뉴를 활성화 하는 프로세서 입니다.
		 해당 메뉴 활성화는 2차 배열이며, 메뉴명, 활성화 하는 (Y,N)으로 구분합니다.
		 해당 활성화 값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는 
		 메뉴명을 1차 배열로 재구성 후 메인에서 출력 되도록 합니다.
		 결과 : ["로켓배송","로켓프레시","골드박스","이벤트","추석"] 
		 단, private 및 return을 활용하여 프로그램을 작성합니다.
		 */
		
		menus ms = new menus();
		System.out.println(Arrays.toString(ms.get()));		

	}

}
class menus{
	private String mdata[][];
	private String rdata[];
	public String a;

	public menus() {
		String ms[][] = {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.mdata=ms;
		redata();
	}
	public void redata() {
		//배열 로드 되는지 한번 보자.
		int ea=this.mdata[0].length;
		String ww[] = new String[ea];
		int w=0;
		int ct=0;
		do {
				if(this.mdata[1][w].equals("Y")) {
				ww[ct]=this.mdata[0][w];
				ct++;
				}
				w++;
		}while(w<ea);
		//String rdata[] =new String[ct];
		this.rdata = ww;
		//System.out.println(Arrays.toString(this.rdata));

		}
	public String[] get() {
		return this.rdata;
	}


}