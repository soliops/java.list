import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class Class_array1 {

	public static void main(String[] args) {
		//Ŭ���� + �޼ҵ� + �迭
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �Է����ּ���?");
		String user_name = sc.next();

		String users[]= {"ȫ�浿","�̼���","������"};
		arrays.lists(users,user_name);
		sc.close();
		/*
		 * ���빮��. ����ڰ� �ڽ� �̸��� �Է��մϴ�.
		 * ����� �̸��� �ش� class ������ ��ϵ� ����� ���� 
		 * �� ������ ����� ������ Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * ��ϵ� ������� ��� "������ �Ǿ� �ֽ��ϴ�."��� ����ϰ�
		 * Ȯ���� ���� ���� ���"�̰����� �Դϴ�."��� ����մϴ�.
		 */
		
	}

}
class arrays{
	public static void lists(String a[],String data) {
		//System.out.println(Arrays.toString(a));
		int w=0;
		int ea = a.length;
		boolean ck =false;
		String msg=""; 
		//�޼ҵ�� �ش� ���� ���� �Ҷ��� ����ִ� ���� ��Ȯ�ϰ� �����ϼž� �մϴ�.
		//String "" or null int 0���� ǥ��
		// int datas=0;  �̷���
		while(w<ea) {
			if(data.equals(a[w])) {
				msg="������ �Ǿ� �ֽ��ϴ�.";
				ck=true;
			}
			
			w++;
		}
		if(ck==false) {
			msg ="�̰����� �Դϴ�.";
			
		}
		arrays ar = new arrays();
		ar.message(msg);
		
	}
		
 	public void message(String m){
	 System.out.println(m);
 }
 	}