import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/* ���빮��. ���ǹ� �ڵ带 �ۼ��Ͻÿ�.
		 * 
		 * ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		 * ���� �⺻ �ڻ�ݾ� : 100000
		 * 
		 * "1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�."��� �޼����� 
		 * ���� ���� ����Ǿ�� �մϴ�.
		 * 1���� �Է½� "�ش� �ݾ��� �Է��ϼ���."
		 * ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.
		 * 
		 * "2�� �Է½� "����� �ݾ��� �Է��ϼ���."
		 * ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ�
		 * �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.
		 * 
		 * */
		
		
		int money = 100000;
		System.out.println("1�� ��½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
        Scanner a = new Scanner(System.in);
        int memo = a.nextInt();
        if (memo==1) {			
        	System.out.println("�ش� �ݾ��� �Է��ϼ���.");
		}
        else if (memo==2) {
        	System.out.println("����� �ݾ��� �Է��ϼ���.");
			
		}
        
        Scanner b = new Scanner(System.in);
        int user = b.nextInt();
        if (memo==1) {
        	System.out.println(money+user);
		}
        else if (memo==2) {
        	System.out.println(money-user);
		}
        a.close();
        b.close();
        
		/*
		 * int money = 100000;
		System.out.println("1�� ��½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
        Scanner a = new Scanner(System.in);
        int memo = a.nextInt();
        Scanner b = new Scanner(System.in);
        if (memo==1) {			
        	System.out.println("�ش� �ݾ��� �Է��ϼ���.");
        	int user = b.nextInt();
        	System.out.println(money+user);
		}
        else if (memo==2) {
        	System.out.println("����� �ݾ��� �Է��ϼ���.");
        	int user = b.nextInt();
        	System.out.println(money-user);
			
		}
        a.close();
        b.close();
        /*
        if (memo==1) {
		}
        else if (memo==2) {
		}*/
        
        /* int money = 100000;
        Scanner a = new Scanner(System.in);
    	System.out.println("1�� ��½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
        int memo = a.nextInt();
        int user;
        Scanner b = new Scanner(System.in);
        if (memo==1) {			
        	System.out.println("�ش� �ݾ��� �Է��ϼ���.");
        	int user = b.nextInt();
        	money=money+user;
		}
        else if (memo==2) {
        	System.out.println("����� �ݾ��� �Է��ϼ���.");
        	int user = b.nextInt();
        	money= money-user
       	else{System.out.println("�������� �ڵ尡 �ƴմϴ�.");
       		a.close();
        	System.out.printf("�ش� �ݾ��� %d�� �Դϴ�.", money);
}
        	a.close();
        	b.close();
        
         */
	}

}
