package Java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		subject sb = new subject();
		sb.setter();

	}

}
class subject extends test1_abstract{
	String user=null;
	Scanner sc =new Scanner(System.in);;
	public String[] sublist = {"����","����","����","����","��ȸ"};
	ArrayList<String> list = new ArrayList<>(Arrays.asList(sublist));
	
@Override
	public void setter() {
	
	System.out.println("�����߰�[1], �������[2], ���񸮽�Ʈ Ȯ��[3] �� ������ �ּ���? ");

	String input = sc.next();
	if(input =="����	") {
		sc.close();
		System.exit(0);
	}
	if(Integer.parseInt(input) ==1) {
		System.out.println("�߰��� ������� �Է��ϼ���?");
		this.setter2();
	}
	else if(Integer.parseInt(input) == 2) {
		System.out.println("������ ������� �Է��ϼ���?");
		this.setter3();
	}else if (Integer.parseInt(input) ==3 ) {
		System.out.println(this.list);
	}
	
	this.setter();
}
@Override
public void setter2() {
	this.user= sc.next();
	int wea = this.list.size();
	int w=0;

		if(!this.list.contains(this.user)) {
			do {
			this.list.add(this.user);
			w++;
			}while(w<wea);
			System.out.println("���������� ��� �Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� ��ϵ� ������� �ֽ��ϴ�.");			
			}
}
@Override
public void setter3() {
	this.user= sc.next();
	int uea = this.list.size();
	int z=0;
		if(this.list.contains(this.user)) {
			do {
			this.list.remove(this.user);
			z++;
			}while(z<uea);
			System.out.println("���������� ���� �Ǿ����ϴ�.");
			}else {
				System.out.println("�ش� ������� �����ϴ�.");			
			}
}
}
