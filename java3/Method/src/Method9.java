import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 �����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ��� �Դϴ�.
		 �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ �ϴ� (Y,N)���� �����մϴ�.
		 �ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� 
		 �޴����� 1�� �迭�� �籸�� �� ���ο��� ��� �ǵ��� �մϴ�.
		 ��� : ["���Ϲ��","����������","���ڽ�","�̺�Ʈ","�߼�"] 
		 ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
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
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.mdata=ms;
		redata();
	}
	public void redata() {
		//�迭 �ε� �Ǵ��� �ѹ� ����.
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