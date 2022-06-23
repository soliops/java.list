import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Example2 {

	public static void main(String[] args) throws IOException {
		/*http://mekeyace.dothome.co.kr/info.txt
		 * 해당 정보는 각 지점별 댐 수위현황을 적용한 데이터입니다
		 * 해당 데이터 중 100 미만의 수위를 가진 댐만
		 * 20220623.txt 파일로 내용이 저장되도록 하십시오.
		 * */
		try {
			String filenames = "water.txt";
			load ld = new load();
			ld.datafile(filenames);
		} catch (Exception e) {
			
		}
	}

}
class load{
	private String path ="C:\\java5\\File_Stream\\src\\";
	private FileReader fr = null;
	public void datafile (String filename) throws IOException {
		this.fr = new FileReader(this.path+filename);
		this.custom();
		this.fr.close();
	}
	public void custom() {
		
	}
}
class create{
	
}