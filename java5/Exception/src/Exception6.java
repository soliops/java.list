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
			String nums1 = Integer.toString(nums);
			on.nums(nums1);
			System.out.println(nums1);
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		finally {
			try {
			int nums = 11;
			String nums1 = Integer.toString(nums);
			on.nums(nums1);
			System.out.println(on.nums(nums1));
			}
			catch(Exception f) {
				System.exit(0);
			}
		}
		
		
	}

}
class outnumber {
	public String nums(String nums1) throws Exception {
		if(Integer.parseInt(nums1)%2==0) {
			throw new Exception("¦���� �Դϴ�.");
		}else {
			String msg = "Ȧ���� �Դϴ�.";
			return msg;			
		}
		
	}
}