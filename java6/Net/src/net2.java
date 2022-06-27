import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/*���� ������ ��������*/
//TCP(���� ��������) - ���� �ӵ��� ����
//UDP(����� ������ ��������) - ���� �ӵ��� ���� (1:1�� ��� ������ ����)
/*PORT
80 : WEB (http://)
21 : FTP (�������۽� ���)
22 : SSH - Linux, Unix (��������, �����ܺ�����)
23 : TELNET - WIndow (�����ܺ�����)
443 : WEB (https://)
25 : SMTP (���ϼ���) - ���� ������
110 : POP3 (���Ϲޱ�) - ����, ���� �ޱ� (�񵿱�ȭ)
143 : IMAP (���Ϲޱ�) - ����, ���� �ޱ�  (������ ����ȭ)
*/
/*SNMP : UDP (���ڹ߼۽ý���) VPN(���� IP) - UDP */
public class net2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է��� �ּ���?");
		String url = sc.next();
		URL u = new URL(url); //URL(Ŭ����) : ��Ʈ��ũ ��θ� ���մϴ�.
		URLConnection con = u.openConnection(); //�ش� ��θ� ����
		
//		System.out.println(con);
		int imgsize = con.getContentLength(); //indexOf ��� -1(����), �׿ܿ��� ���� Ȯ��
		System.out.println(imgsize);
		String imgtype = con.getContentType(); //���ϼӼ��� Ȯ���ϴ� �κ�
		System.out.println(imgtype);
		long date = con.getDate(); //���� �ε� ��¥
		System.out.println(date);
		
		//openStream() : URL���� ���
		InputStream is =u.openStream(); //URL���� ������ �о�ö� �����
		BufferedInputStream bi = new BufferedInputStream(is); //URL���� ���� ������ �ӽ�����
		byte data[] = new byte[1024]; //1024 - 1KB �ش� ������ ������
		System.out.println(data.length);
		FileOutputStream fo = new FileOutputStream("copy.mp4"); //��������
		//�ּ�:http://mekeyace.dothome.co.kr/123.mp4
//		fo.write(bi.read(data));
		
		int imgdata = 0;
		int cnt = 0; //�ݺ���
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata); //������ ������ �ٿ��ֱ� �ϴ� ����
			cnt += imgdata; //1024++
			System.out.println("�ٿ�ε� ��..."+(cnt*100)/imgsize+"%");
		}
		fo.flush();
		fo.close();
		System.out.println("�ٿ�ε尡 �Ϸ� �Ǿ����ϴ�.");
		sc.close();
	}

}
