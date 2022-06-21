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
		String b = "aA1";
		try { //try : �ش� ���� int�� ������(1)
			 a = Integer.valueOf(b); 
			 //error �߻� : a1�̶�� �����ε�, 
			 //������ ���ڷ� ��ȯ�� a��� ���ڷ� ���Ͽ� ���� �߻�(2)
		}
		catch(NumberFormatException z){
			System.out.println(z); //(3)� �κп��� ������ �߻�
		}
		finally {
			 b = b.replaceAll("[a-z][A-Z]", ""); //������ ��ó�� (4)
			 //replaceAll ����  [a-z]�� ���� �ҹ��� ����, [A-Z]�� �빮�� ����
			 a = Integer.valueOf(b); //�ٽ� ������ ���ۼ��ؼ� ���(5)
			System.out.println(a); //(6)���� ����� ���
		}
	}

}
