
public class example7 {

	public static void main(String[] args) {
		/*
		 * ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		 * [data]
		 * {"ȫ�浿","�հ�"},
		 * {"�̼���","�հ�"},
		 * {"������","���հ�"},
		 * {"������","�հ�"},
		 * {"������","���հ�"},
		 * {"�庸��","���հ�"}
		 * 
		 * ������ �迭 �����̸�, �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 * ��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 * 
		 * ��� : ȫ�浿, �̼���, ������
		 */
		
		passlist pass1= new passlist();
		pass1.pass();
		
		
		
		
	}
	
}
class passlist{
	public void pass () {
		String data[][] = {
			 {"ȫ�浿","�հ�"},
			 {"�̼���","�հ�"},
			 {"������","���հ�"},
			 {"������","�հ�"},
			 {"������","���հ�"},
			 {"�庸��","���հ�"}
		};
		
		int ea = data.length;
		int pea = data[0].length;
		int w=0;
		do {
			int ww=0;
			do {
				if (data[w][ww].equals("�հ�")) {
					System.out.print(data[w][0]+", ");
					
					///    \n�ϸ�  printf�� ���پ� ������. 
				}
				ww++;
			}while(ww<pea);
		w++;
		}while(w<ea);
	}
}