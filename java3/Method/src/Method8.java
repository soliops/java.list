
public class Method8 {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 ���� ���α׷��Ӱ� �ش� DB(Database)�� �� ��
		 Ȧ������ ���� �� ������ �ް��� �մϴ�. 
		 �ش� ������ ��� �ɼ� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.
		  
		 */
		
		

		odbc db = new odbc();
		System.out.println(db.odbc1());
		
		
		}
	
}

class odbc{
	private int ori[];  //�迭���� ������� �ʵ��� ���
	private	int count=0; //Ȧ���� ��� +1�� ���� �ϱ� ���� �ʵ� ������

	public odbc() {
		int odata[] = {15,22,17,14,32,35,19,33};
		this.ori = odata;		
		
	}
	public int odbc1() {
		
		int w = 0;
		do {
			
			if(this.ori[w]%2==1) {
				this.count++; //Ȧ�� �� ��� +1�� ����
			}
			
			w++;
		}while(w<+this.ori.length);
		return this.count; //���� ���� return��Ŵ.
		

	}
}
