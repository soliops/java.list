
public class For1 {

	public static void main(String... args) {
		/* ���빮��
		 * ������ 2~3�ܱ����� ����Ͻÿ�.
		 */
		
		//���� �ݺ���
		int f,ff;   //�ݺ����� ����� ���� ������ �̸� �Ͽ���.
		
		for(f=2;f<=3;f++) {  //ū �ݺ��� 2~3��� ȸ����
			for(ff=1;ff<=9; ff++) { //���� �ݺ��� 1~9���� ȸ����

				//�ش� ���� �ݺ����� �۵��� ������ ����� �����
				//System.out.println(f+"*"+ff);		
			}
		}
		
		/* ���빮��
		 * ������ 5~7�ܱ��� ����� �ϵ� 4������ ���������� ������ ���ı��� ����Ͻÿ�.
		 * 5*1~ 7*4 
		 * �ش� ������� �� �հ踦 ����Ͻÿ�.
		 */
		int t,tt;
		int total=0;
		for(t=5;t<=7;t++) {
			for(tt=1;tt<=4;tt++) {
			//System.out.printf("%d*%d",t,tt);	
				total+=(t*tt);
			}
		}
		System.out.println(total);
	}

}
