package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) throws IOException {
		/*
		 ���빮��
		 ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷� �Դϴ�.
		 ���μ��� ���۽� "���ڸ� �Է��� �ּ���: " �� 6���� ���ڸ� �Է� �ް� �˴ϴ�.
		 �׸��� lotto.txt ����� ���� ������ �ε� �Ͽ� ����ڰ� �Է��� ����
		 ����� ���Ͽ� ��� ��������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
		 
		 [��� ����]
		 �ζ� ��� : �� 3���� ��ȣ�� ���߼̽��ϴ�.
		 */
		lotto tto = new lotto();
		tto.start();
		System.out.println(tto.getter());
	}
	
}
class lotto{
	FileReader fr = null;
	String fname = null;
	ArrayList<String> lottonum = null;
	Scanner sc = null;
	int count = 0;
	int usernum= 0;
	public void start() throws IOException {
		this.fname = "C:\\javatest\\javatest\\src\\Java_test\\lotto.txt";
		this.fr = new FileReader(this.fname,Charset.forName("EUCKR"));
		BufferedReader br = new BufferedReader(this.fr);
		this.lottonum = new ArrayList<>();
		String ltnum = br.readLine();
		do {
			this.lottonum.add(ltnum);
		}while((ltnum=br.readLine())!=null);
		System.out.println(this.lottonum);
		this.number();
	}
	public void files () {
		
	}
	public void number () {
		this.sc = new Scanner(System.in);
		int w= 0;
		do {
			System.out.println("���ڸ� �Է����ּ���.");
			this.usernum = this.sc.nextInt();
			if(this.usernum==Integer.valueOf(this.lottonum.get(w))) {
				this.count++;
			}
			w++;
		}while(w< this.lottonum.size());
	}
	public String getter() {
		String msg = "�ζ� ��� : �� "+this.count+" ���� ���߼̽��ϴ�.";
				return msg;
	}
}