import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//이미지(binary), 영상 파일 설정 byte단위 (FileReader (X))
//FileInputStream Stream을 이용해야함. read()만 사용
public class file14 {

	public static void main(String[] args)  {
		try {
		InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\img.jpg");
//		System.out.println(is.read()); //색 수치를 읽는다.
//		byte b[] = new byte[is.available()];
		//Stream은 버퍼와 비슷하여 read()를 사용하는 순간
		//해당 메모리에서 비워지는 사항이 발생합니다.
		
//		System.out.println(is.read(b));// 전체 크기 용량 확인, 0뜨면 파일이 깨진거
		//RGB 0~255만 나온다
		byte b[] = new byte[is.available()/100]; //읽어들이는 배열의 크기를 강제로 조절함.
		FileOutputStream os = new FileOutputStream("imp_test.jpg");
//		int img = is.read(b);
//		System.out.println(img);
		int img = 0; //읽는 바이트수
		int check= 0;//읽는 횟수
//		os.write(b);//반복문 사용하지 않음
//		while((img=is.read(b))!=-1) {
		
		/*다운로드시 로드를 출력이나, progress를 이용하여 보여줄 때*/
		while(true) { //loop
			img = is.read(b); // 해당 파일을 읽어서 바이트 변수로 넘김
			if(img==-1) {
				break;
			}else {
				os.write(b,0,img); //다운로드 %를 표시할 때 사용하기 위함 progress바 사용가능				
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
