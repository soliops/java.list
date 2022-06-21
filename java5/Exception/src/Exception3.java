import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 응용문제
		 data = {"hong45","lee90","kang100","park70","kim72"};
		 
		 해당 배열 데이터 값을 main2라는 메소드로 값을 던집니다. 
		 해당 값을 던질때 예외처리를 무조건 발생 시켜야 하며,
		 최초 값을 던질 때는 가공없이 던지게 됩니다.
		 main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산 한 결과가
		 나와야 됩니다.
		 단, 숫자 변환시 문제가 발생할 경우 finally로 체크 후 main2
		 메소드로 다시 호출 하여 정상적으로 데이터가 나오도록 하십시오.
		 */
	
		Exception3 ex = new Exception3();
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
			try {
				ex.main2(data);

			} catch (Exception e) {
				System.out.println(e); //toString();이 기본
			}
			finally {
				ArrayList<String> rdata = new ArrayList<>();
				int ww = 0;
				String modify;
				do {
					modify=data[ww].replaceAll("[a-zA-Z]","");
					rdata.add(modify);
					ww++;
				}while(ww<data.length);
				String cdata[] = new String[rdata.size()];
				int q = 0;
				do {
					cdata[q]=rdata.get(q);
					q++;}while(q<rdata.size());
				try {
					ex.main2(cdata);
				}catch(Exception h) {
					//printStackTrace() 실무에서도 안쓴다
					if(h.getMessage()==null) {
						System.exit(0);
					}else {
						System.out.println(h.getMessage());
					}
				}
			}
			
		
	}

	public void main2(String[] data)throws Exception {
		int w=0;
		int values;
		int total=0;
		try {
		do {
			values = Integer.valueOf(data[w]);
			total += values;
			w++;
		}while(w<data.length);
		System.out.println(total);
		}catch(Exception z) {
			System.out.println(z);
		}
		Exception c = new Exception();
		throw c;
	}
}
