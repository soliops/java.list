package java_test;

public class test2{

	public static void main(String[] args) {
		basket bk = new basket();
			bk.setter();
		System.out.println(bk.getter());
		
	}

}
class basket extends test2_data{
	String price = null;
	int total=0;
	public String[] datas ={ "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" };
	public void setter() {

		int w=0;
		do {	
			datas[w]= datas[w].replaceAll("[^0-9]","");
			data[w]=data[w].replaceAll("[^0-9]","");
			this.total+=Integer.parseInt(datas[w])*Integer.parseInt(data[w]);
			w++;
		}while(w<this.datas.length);
		this.price = "�� ���� �ݾ��� : "+this.total+"�� �Դϴ�.";

		
	}
	public String getter() {
	return this.price;	
	}
}