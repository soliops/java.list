package Ab;

import java.lang.reflect.Member;

//method_1a.java
public class method_1 extends ide_mth1{
	//package Ab2���� import�� �� �ֵ��� �ϸ�, �ܺ� Ŭ������ �����ϰ� ��� ����������

	public void recall() {
		//public�� ������ ȣ���� �Ұ����ϴ�.
		System.out.println("test");
	}
	protected static void name (){
		//proteded static�� ���� ����� �ؾ� ȣ��ȴ�.
		System.out.println("ȫ�浿");
	}
	public static void main(String[] args) {
		/*Arrays.sort : �迭 �������� ���� (����,�ѱ�,����)
		 ��, ������ ��� �빮�ڰ� ���� ���� ������������ ���� �˴ϴ�.
		 APPLE.... apple....
		 */
		/*
		int number_data[]= {5,7,1,4,9,2};
		Arrays.sort(number_data); //��������
		System.out.println(Arrays.toString(number_data));
		*/
		/*
		String user_data[]= {"ȫ�浿","�̼���","�庸��","������"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));
		*/
		String a="park";
		int b=2000;
		ide_mth1 ide = new ide_mth1();
		ide.setter(a,b);
		System.out.println(ide.getter());
//		String c = "����";
		/*
		 ������ 2�� �����ؼ� �ϳ��� ����, ����
		 ���� ������ ����ڿ� ���̵� Ȯ�� �� �ش� ����Ʈ�� ���� �ǵ��� �մϴ�.
		 ��, ���� ����Ʈ + ������ ����Ʈ �� ���� ����� ����ϼž� �մϴ�.
		 ����� ���� Ŭ�������� �մϴ�.
		 
		 �迭 ������ : 
			String member_ship[][]={
				{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
				{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
			};
		 */
		
	}

}
class ide_mth1 extends mth1{
	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total=0;
	private String msg;
	public ide_mth1(){ 
		this.member_ship= new String[][]{
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
		this.ea=this.member_ship[0].length;
	}
	@Override
	public void setter(String data1, int data2) {
		this.data1=data1;
		this.data2=data2;
//		if(this.data3.equals("����")){
//			this.loops();
//		}else{
//			this.loops2();
//		};
		this.loops(this.data1,this.data2,this.ea);
	};
	public void loops (String a, int b,int c) {
		//static�̸� this ����, ���Ÿ� this�� ������ �۾��Ҷ�
		int w = 0;
		do {
			if(this.member_ship[0][w].equals(a)) {
				this.total= Integer.parseInt(this.member_ship[1][w])+data2;
			}
			w++;
		}while(w<c);
		this.msg="����";
	}
	@Override
	public void setter(int data3[]) {
	};
	@Override
	public String getter() {
		String print = this.data1 + "���� ����Ʈ�� "+this.total+" "+this.msg+" �Ǿ����ϴ�.";
		return print;
	}
	
}