
public class Example5 {

	public static void main(String[] args) {
		/*
		 ���빮��5
		 ���� �ڵ带 ���� while������ ��ȯ�Ͻÿ�. 
		int sum=0;
		int l;
		for(l=1;l<=12;l++) {if(l%2==0) {sum=1+sum;
	} System.out.println("1���� 12������ ¦���� �� = " +sum);
		}
		 */
		
		 int sum=0;
		 int l=1;
		 while (l<=12) {
			if(l%2==0) {
				sum=l+sum;
			}
			 l++;
		}
		 System.out.println("1���� 12������ ¦���� �� = " +sum);
	}
}