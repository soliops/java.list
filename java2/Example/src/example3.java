
public class example3 {

	public static void main(String[] args) {
	/*
	 * ���빮��
	 * �迭 +�⺻(Ŭ����) �޼ҵ� ����
	 * product: ����, ����, ���, ��, ����, Ű��, �ٳ���, ����
	 * moneys : 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 
	 * ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
	 * ��, �� �� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����Ͻÿ�.
	 * 	
	 */
		
	String product[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
	int moneys[] = {35000,8000,4000,5500,3800,4400,11000,18900};
	totals(product,moneys);
		
		
		
	}
	
	public static void totals(String p[],int m[]) {
		
		int ea=p.length;
		int w=0;
		int total=0;
		do {
			if(!p[w].equals("�ٳ���")&&!p[w].equals("���")) {
			//System.out.println(p[w]);
				total+=m[w];
				
			}
			w++;
		}while(w<ea);
		System.out.printf("�� ���� �ݾ� : %s��",total);
	}
	
	
	
}
