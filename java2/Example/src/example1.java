
public class example1 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����)�޼ҵ� ����.
		 * 1�� �迭�� ������ ���� ���� �ֽ��ϴ�.
		 * �迭����Ʈ 22 33 44 55 66 77 88 99 �̸�
		 * �ش� ��ü ���� ��� ���� ���հ� ����
		 * ������ �޼ҵ�� ó���ǵ��� �մϴ�.
		 * ��, �ݺ����� ������ do-while������ �ۼ��մϴ�.
		 */

		int A[] = {22,33,44,55,66,77,88,99};
		example1 js = new example1();
		js.score(A);
		
		//���� �ؿ��� static�̸� �ٷ� score(); �ϸ� �ȴ�.
	}
	
	public void score(int b[]) {
		int w=0;
		int ea=b.length;
		int total=0;
		do {
			total+=b[w];
			w++;
		}while(w<ea);
		System.out.printf("�� �հ� : %s��",total);
}

}