import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//�̹���(binary), ���� ���� ���� byte���� (FileReader (X))
//FileInputStream Stream�� �̿��ؾ���. read()�� ���
public class file14 {

	public static void main(String[] args)  {
		try {
		InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\img.jpg");
//		System.out.println(is.read()); //�� ��ġ�� �д´�.
//		byte b[] = new byte[is.available()];
		//Stream�� ���ۿ� ����Ͽ� read()�� ����ϴ� ����
		//�ش� �޸𸮿��� ������� ������ �߻��մϴ�.
		
//		System.out.println(is.read(b));// ��ü ũ�� �뷮 Ȯ��, 0�߸� ������ ������
		//RGB 0~255�� ���´�
		byte b[] = new byte[is.available()/100]; //�о���̴� �迭�� ũ�⸦ ������ ������.
		FileOutputStream os = new FileOutputStream("imp_test.jpg");
//		int img = is.read(b);
//		System.out.println(img);
		int img = 0; //�д� ����Ʈ��
		int check= 0;//�д� Ƚ��
//		os.write(b);//�ݺ��� ������� ����
//		while((img=is.read(b))!=-1) {
		
		/*�ٿ�ε�� �ε带 ����̳�, progress�� �̿��Ͽ� ������ ��*/
		while(true) { //loop
			img = is.read(b); // �ش� ������ �о ����Ʈ ������ �ѱ�
			if(img==-1) {
				break;
			}else {
				os.write(b,0,img); //�ٿ�ε� %�� ǥ���� �� ����ϱ� ���� progress�� ��밡��				
			}
//			os.write(b);
			check++;
			if(check%2==0) {
			System.out.println(check+"%");
			}
		}
		
		}
		catch (IOException i) {
			
		}
		catch (Exception e) {
			
		}
	}

}
