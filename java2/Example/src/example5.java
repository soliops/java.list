import java.util.Arrays;

public class example5 {
	
	public static void main(String[] args) {
		/*
		 * 2���迭 + �⺻(Ŭ����) �޼ҵ� ����
		 * ��ϵ� �� �� vip ���� ����Ʈ�� ����Ͻÿ�.
		 * user_list: ȫ�浿, �̼��� ������ ������ ������� ������ ����屺
		 * user_level: gold vip guest gold vip vip guest
		 * ��� ��� : �̼���, �������, ������,
		 * 
		 */
		
		
		String user[][]= {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"gold","vip","guest","gold","vip","vip","guest"}
		};
		
		example5 ex = new example5();
		
		ex.user_lists(user);
		
	}
	public void user_lists(String ulist[][]) {
		int gp = ulist.length;
		int ea = ulist[0].length;
		int w=0;
		/*
		int ct=0;
		String mname[] = new String[ea];
		do {
				if(ulist[1][w].equals("vip")) {
				
					mname[ct]=ulist[0][w];
			ct++;
				}
			w++;
		}while(w<ea);
		System.out.println(Arrays.toString(mname));
		*/
		while(w<gp) {
			int ww=0;
			while(ww<ea){
				if(ulist[w][ww].equals("vip")) {
					System.out.println(ulist[0][ww]);
					
				}
			
				ww++;
			}
			w++;
		}
		
		
		
		
		
	}
}
