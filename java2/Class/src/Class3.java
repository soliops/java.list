
public class Class3 {
	//Package�� ������� ���� (default)��
	public static void main(String[] args) {
		// �ڷ���(��������) ��ȯ
		// double -> int�� ��ȯ
		double a = 137.5;
		int b = (int) a;
		
		//int -> double�� ��ȯ
		int c = 35;
		double d = (double)c;
		System.out.println(d);

		//String -> int 
		String x = "35";
		int z = Integer.parseInt(x);
		//parseint (int���� ����ϴ� ������� �����)
		System.out.println(z);
		
		//String -> int 
		String xx = "35";
		String xx2 = "156";
		//int zz = Integer.parseInt(xx);
		int zz =Integer.valueOf(xx); 
		//valueof �÷��� �޼ҵ� (�޼ҵ��Լ�) -> parseint
		int total = Integer.parseInt(xx)+Integer.parseInt(xx2);
		//�������� ���������� ��ȯȭ�� �������� ó����
		System.out.println(total);
		
		
		//Long ��뤸�� Long.parseLong �����
		String j = "1923456789";
		String j2="923456789";
		//long total2 = Integer.parseInt(j)+Integer.parseInt(j2);
		long total2=Long.parseLong(j2)+Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total3);
		
		//����(char) -> ����(String) : �⺻���ĸ� ����
		char p = 'N';
		String f = String.valueOf(p);
		//���� ->���� (valueof)�����
		System.out.println(p);
	}

}
