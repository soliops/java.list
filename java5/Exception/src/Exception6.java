public class Exception6 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ����ڰ� 45 * 3 + 16 + 5 + 22 * 8 �ش� ���� ����
		 �������� �ܺ� Ŭ������ �����մϴ�.
		 �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ�
		 Ȧ���� ��� "Ȧ���� �Դϴ�."�� �ٽ� ȸ���մϴ�.
		 */
		
		
		outnumber on = new outnumber();
		try {
			int nums = 45*3+16+5+22*8;
			on.nums(nums);
			String nums1 = on.nums(nums); //return ��
			
			System.out.println(nums1);
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e.getMessage());
			}
		}
		finally {
			try {
			int nums = 11;
//			String nums1 = Integer.toString(nums);
			on.nums(nums);
			System.out.println(on.nums(nums));
			}
			catch(Exception f) {
				System.exit(0);
			}
		}
		
		
	}

}
class outnumber {
	//�ڷ��� �޼ҵ忡�� return �� ����, ����, object�� ���� �ڷ����� ����Ǿ� ����
	public String nums(int nums1) throws Exception {
		if((nums1)%2==0) {
//			Exception ec= new Exception("����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�.");
//			throw ec;
			throw new Exception("¦���� �Դϴ�.");
		}else {
			String msg = "Ȧ���� �Դϴ�.";
			return msg;			
		}
		
	}
}