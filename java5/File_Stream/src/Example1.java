import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/*
���빮��
�ش� ����ڰ� ��ȭ������ �˻��մϴ�.
�ش� ��ȭ���� �´� ������ ���� ���� ���
��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�.
��Ʈ : Scanner ���
"�˻��� ��ȭ������ �Է��ϼ���." ���˵���2
[���˵���] - ��õ5 2022�� 4�� ����

"�˻��� ��ȭ������ �Է��ϼ���." �Ƿη�
�˻��� ��ȭ�� Ȯ�� ���� �ʽ��ϴ�.
*/
public class Example1 {

	public static void main(String[] args) throws IOException{
		try {
			//���Ϸε� �� �޼ҵ� ����
			Scanner sc = new Scanner(System.in);
			System.out.println("1. ������ȭ 2. ����������ȭ : ");
			int user = sc.nextInt();
			if(user ==1) {
				movie m = new movie("movie_db.txt");
				System.out.println(m);
			}
			else if(user ==2) {
				System.out.println("���� �غ��� �Դϴ�.");
			}
			sc.close();
//			else if(user ==2) {
//				movie m = new movie("movie_expetdb.txt");
//			}

		}
		catch (Exception k) {
			if(k.getMessage()!=null) {
			System.out.println("���� ���񽺰� ���������� �ʽ��ϴ�.");
			}
		}	
	}

}

class movie{
	//���� Ŭ����
	private String path = "C:\\java5\\File_Stream\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;
	public movie (String filename) throws IOException{
		try {
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.custom();
			this.fr.close();
			this.bf.close();
			this.search();
			
		}
		catch (Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
				}
		}
	}
	public void custom() throws IOException{
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		String datas = this.bf.readLine();
		//do-while���̸� �����͸� �ϳ� ���� �ְ� �������Ѵ�.
		do{
			this.list.add(datas);
		}while((datas=this.bf.readLine())!=null);
		
	}
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ������ �Է��ϼ���. : ");
		//indexOf, contains
		String subject = this.sc.next().intern();
		Boolean call = false;
		if(subject == "����") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb : this.list) {
			//if(moviesb.indexOf(subject)!=-1	
			if(moviesb.contains(subject)) {
				System.out.println(moviesb);
				call= true;
			}
		}
		if(call==false) {
			System.out.println("�����͸� Ȯ���� �� �����ϴ�.");
		}
//		sc.close();
		this.search();//����Լ�
		
	}
}