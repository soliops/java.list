//������ȣ �߼� �ý��� -awt6_abstract�� �����۾�
public class awt6 {

	public static void main(String[] args) {
		/**/
		numbering nb =new numbering();
		nb.design();
	}

}
class numbering extends awt6_abstract {
	private int numck;
	private String return_msg;
	private int numpc;
	@Override
	public String numok() {
		return this.return_msg;
	}
	@Override	
	public void numcheck(int number) {
		this.numck=number;
		this.return_msg=null;
		if(this.numck==this.numpc) {
			return_msg=Integer.toString(this.numpc);
			
		}
	}
	@Override
	public void datalist(int numpc) {
		this.numpc= numpc;
	}
}