
public class Exception_a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1[] = {"ȫ�浿","55","������","������","48","�̼���","����","35","88"};
		int w = 0;
		do {
			if(Integer.valueOf(data1[1].replaceAll("[0-9]", ""))!=0) {
				System.out.println(data1);
			}
		w++;
		}while(w<data1.length);
	}

}
