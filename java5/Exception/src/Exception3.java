import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 data = {"hong45","lee90","kang100","park70","kim72"};
		 
		 �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�. 
		 �ش� ���� ������ ����ó���� ������ �߻� ���Ѿ� �ϸ�,
		 ���� ���� ���� ���� �������� ������ �˴ϴ�.
		 main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ� �� �����
		 ���;� �˴ϴ�.
		 ��, ���� ��ȯ�� ������ �߻��� ��� finally�� üũ �� main2
		 �޼ҵ�� �ٽ� ȣ�� �Ͽ� ���������� �����Ͱ� �������� �Ͻʽÿ�.
		 */
	
		Exception3 ex = new Exception3();
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
			try {
				ex.main2(data);

			} catch (Exception e) {
				System.out.println(e); //toString();�� �⺻
			}
			finally {
				ArrayList<String> rdata = new ArrayList<>();
				int ww = 0;
				String modify;
				do {
					modify=data[ww].replaceAll("[a-zA-Z]","");
					rdata.add(modify);
					ww++;
				}while(ww<data.length);
				String cdata[] = new String[rdata.size()];
				int q = 0;
				do {
					cdata[q]=rdata.get(q);
					q++;}while(q<rdata.size());
				try {
					ex.main2(cdata);
				}catch(Exception h) {
					//printStackTrace() �ǹ������� �Ⱦ���
					if(h.getMessage()==null) {
						System.exit(0);
					}else {
						System.out.println(h.getMessage());
					}
				}
			}
			
		
	}

	public void main2(String[] data)throws Exception {
		int w=0;
		int values;
		int total=0;
		try {
		do {
			values = Integer.valueOf(data[w]);
			total += values;
			w++;
		}while(w<data.length);
		System.out.println(total);
		}catch(Exception z) {
			System.out.println(z);
		}
		Exception c = new Exception();
		throw c;
	}
}
