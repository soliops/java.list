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
	public String[] datas ={ "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" };
	public void setter() {

		int w=0;
		do {	
			datas[w]= datas[w].replaceAll("[^0-9]","");
			data[w]=data[w].replaceAll("[^0-9]","");
			this.total+=Integer.parseInt(datas[w])*Integer.parseInt(data[w]);
			w++;
		}while(w<this.datas.length);
		this.price = "총 결제 금액은 : "+this.total+"원 입니다.";

		
	}
	public String getter() {
	return this.price;	
	}
}