/*
 Exception : try, catch�� �԰� ����� �ϰ� �˴ϴ�. (����ó������) 
 RuntimeExecption (Error �߻��� ����ó�� üũ�� ����) - Null, Class, Arraysize
 OtherException - (����ó�� üũ���� �����)
	Exception [����]
	NullPointer : Null��ü�� �����Ҷ�
	ClassCast : Ŭ������ ��ȯ
	NumberFormat : ���������� ��ȯ
	ArryaIndexOutOfBound : �迭������ �ε��� ��ȣ ����
	IOException : ����� ���� �߻� O
	Exception : ��ü ����ó�� ��Ȳ O
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		try {
			 a = Integer.valueOf("ȫ�浿1");
		}
		catch(Exception z){
			System.out.println(z);
		}
		finally {
			 a = Integer.valueOf("1");
			System.out.println(a);
		}
	}

}
