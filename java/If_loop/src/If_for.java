
public class If_for {

	public static void main(String[] args) {
		final int a =1; /*
		final�� ���� ���� > ����� ���� 
		���: ���� ������ �ʴ� ���� ���մϴ�.
		*/
		//final String name ="ȫ�浿";
		//name = "�̼���";
		
		System.out.println(a);
		
		final int ct = 5;  //������
		int f; //�ݺ���
		boolean ok = false; //���ǿ� ���� true, false�� ����
		for(f=1; f<10; f++) { //�ݺ��� ���� �������� ���� ���
			if(f==ct) {
			System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
			ok=true; //���ǿ� ���� ���� �����մϴ�.
			}
		}
		if(ok==false) { /*
		���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ���
		��µǴ� �ڵ� �Դϴ�.
		*/
		System.out.println("Ȯ���� ���� �ʴ� ���� �Դϴ�.");	
		}
		
		
		/*�� 20���� ���� �ݺ��մϴ�.
		 * �� �� Ȧ������ ����ϵ��� �մϴ�.
		 */
		
		int ff;
		String odd="";				//odd Ȧ�� even ¦��
 		
		for(ff=1;ff<=20;ff++) {
			if(ff%2 !=1) {
				
				System.out.print(ff +" ");
				
			}
			else { //���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
				odd+=ff+" ";   //�߰��� ��� " " ������� Ȱ���Ͽ� ������
				}
			
		}
		System.out.println(odd);
	}

}
