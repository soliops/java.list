

public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java 연계
		decorate de = new decorate();
		de.view();
	}

}
class decorate extends awt4_class{
	public String msg="";
	public void btn_push(int c){
		/*사용자가 입력한 숫자를 기준으로 구구단을 작성*/
	
		int w=1;
		
		do {
			this.msg+=(c+"*"+w+"="+c*w+"\n");
//			System.out.printf("%s * %s = %s \n",c,w,c*w);
//			System.out.println(c+" * "+w+" = "+c*w);
			w++;
		}while(w<=9);
		
	}
	public String calls() {
		return this.msg;
	}
}