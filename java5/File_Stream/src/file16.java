import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe.SourceChannel;

import javax.xml.transform.Source;

//이미지 읽고, 쓰기
public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x => r(read) : 읽기, w(write) : 쓰기, x(excute) : 실행
		//RandomAccess : 사용자가 해당 파일속성 권한을 설정할 수 있음
		try {
		String files = "C:\\java5\\File_Stream\\src\\img.jpg";
		String cp = "img222.jpg";
		RandomAccessFile file = new RandomAccessFile(files, "r");
		RandomAccessFile file2 = new RandomAccessFile(cp, "rw");		

		//FileChannel : IO(FileInputStream, FileOutputStream) 같은 형태
		//getChannel() : RandomAccessFile 해당 메소드를 가져오는 역할
		
		FileChannel fc = file.getChannel();
		FileChannel target = file2.getChannel();
		
		//transferTo, transferFrom (복사형태)
//		fc.transferTo(0, fc.size(), target); //(배열0, 배열끝번호, 복사위치)
		target.transferFrom(fc, 0, fc.size()); //(복사할 파일, 배열0, 배열끝번호)
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
