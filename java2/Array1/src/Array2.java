
public class Array2 {

	public static void main(String[] args) {

		String id[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(id[4]);
		//int word = id[4].length();
		//System.out.println(word);
		
		/*
		 * ���빮�� �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ������ 3�ܾ� �̻� ��½�Ű�ÿ�.
		 * 
		 */
		int member= id.length; //��ü ȸ������ �ľ��ϱ� ����
		int w=0;
		int word; //������ �迭 �������� ���� �����ľ�
		do { 
			word = id[w].length(); //���� ���� �ľ�
			
			if(word>3) { //���ܾ� �̻�(����)�� �����͸� ���
				System.out.println(id[w]);
			}
			w++;
		}while(w<member);
		
		
		/*
		 * ���빮��
		 * �迭 �����ʹ� ������ ����
		 * 15 60 11 14 27
		 * ���� ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�.
		 */
		int data[] ={15,60,11,14,27}; //�迭
		
		int dw=0; //�迭 ������
		int data_ea= data.length;
		int total=0;
		while(dw<data_ea) {
			total=total+data[dw];   //total+�迭�� �ش� �����͸� ��� ����
			dw++;
		};
		System.out.println(total);
		
		int d[] = {11,233,51,23,56};
		int d2 = 0;
		int d3 = d.length;
		int total2=1;
		do {
			total2*=d[d2];
			d2++;}while(d2<d3);
		System.out.println(total2);
		
		
		
	}

}
