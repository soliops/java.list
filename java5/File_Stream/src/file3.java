import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

//IOException + Exception
public class file3 {
	public static void main(String[] args) throws Exception {
		filein f = new filein();
	}

}
class filein{
	FileReader fr = null;
	public filein() throws IOException{
		try {
		this.fr = new FileReader("C:\\java5\\File_Stream\\src\\data.txt",Charset.forName("UTF8"));
		this.words();
		}
		catch(IOException k) {
			if(k.getMessage()!=null) {
				System.out.println(k);
			}
		}
		catch(Exception k1) {
			if(k1.getMessage()!=null) {
				System.out.println(k1);
			}
		}

	}
	public void words() throws IOException{
		try {
			int t=0;
			while(true) {
				t=this.fr.read();
				if(t!=-1) {
				System.out.printf("%s",(char)t);
				}
				else {
					break;
				}
			}
			this.fr.close(); //FileReader Á¾·á
		} catch (Exception j) {
			if(j.getMessage()!=null) {
				System.exit(0);
			}
		}
	}
			
}