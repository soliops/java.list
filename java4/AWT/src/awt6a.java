
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
				this.message2 = "���� �Ϸ� �Ǿ����ϴ�.";

			}
			else {
				this.message2="���� ��ȣ�� �ٽ� Ȯ�� �Ͻñ� �ٶ��ϴ�.";
			}
			System.out.println(pc);
			
			
		}
		@Override
		//getter
		public String getter() {
			return this.message2;
		}
	
}