
public class awt6a {

	public static void main(String[] args) {
		
		handle2 ha = new handle2();
		ha.design();
	}

}
class handle2 extends awt6a_abstract{
		String message2 = "";
		@Override
		//setter
		public void setter(String userno) {

			if(userno.equals(pc)) {
				this.message2 = "인증 완료 되었습니다.";

			}
			else {
				this.message2="인증 번호를 다시 확인 하시길 바랍니다.";
			}
			System.out.println(pc);
			
			
		}
		@Override
		//getter
		public String getter() {
			return this.message2;
		}
	
}