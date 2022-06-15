
public class Class3 {
	//Package를 사용하지 못함 (default)라서
	public static void main(String[] args) {
		// 자료형(데이터형) 변환
		// double -> int로 변환
		double a = 137.5;
		int b = (int) a;
		
		//int -> double로 변환
		int c = 35;
		double d = (double)c;
		System.out.println(d);

		//String -> int 
		String x = "35";
		int z = Integer.parseInt(x);
		//parseint (int형에 사용하는 산술연산 언어임)
		System.out.println(z);
		
		//String -> int 
		String xx = "35";
		String xx2 = "156";
		//int zz = Integer.parseInt(xx);
		int zz =Integer.valueOf(xx); 
		//valueof 플래시 메소드 (메소드함수) -> parseint
		int total = Integer.parseInt(xx)+Integer.parseInt(xx2);
		//문자형을 숫자형으로 변환화여 산술계산을 처리함
		System.out.println(total);
		
		
		//Long 사용ㅈ시 Long.parseLong 사용함
		String j = "1923456789";
		String j2="923456789";
		//long total2 = Integer.parseInt(j)+Integer.parseInt(j2);
		long total2=Long.parseLong(j2)+Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total3);
		
		//문자(char) -> 문자(String) : 기본지식만 제공
		char p = 'N';
		String f = String.valueOf(p);
		//문자 ->문자 (valueof)만사용
		System.out.println(p);
	}

}
