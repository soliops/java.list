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
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\movie_db.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> list = new ArrayList<String>();
		String words = "";
		while((words=br.readLine())!=null) {
			list.add(words);
			
		}
		try {
		Scanner sc = new Scanner(System.in);
		int w= 0;
		System.out.println(list.size());
		System.out.println(list.get(w));
		do {
			System.out.println("�˻��� ��ȭ������ �Է��ϼ���.");
			String search = sc.next();
			String ob = list.toString();
			System.out.println(ob);
			boolean b = list.get(w).contains(search);
			System.out.println(b);
			if(ob.toString().contains(search)) {
				System.out.println(list.get(w));
				break;
			}else if(!ob.toString().contains(search)){
				System.out.println("�˻��� ��ȭ�� Ȯ�� ���� �ʽ��ϴ�.");
			}
			w++;
		}while(w<list.size());
			sc.close();
			br.close();
			fr.close();
		}
		catch (Exception e) {
			if(e.getMessage()!=null) {
			System.out.println(e.getMessage());
			}
		}	
	}

}
