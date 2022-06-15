
public class For1 {

	public static void main(String[] args) {
		//반복문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법
		//반복문에는 String문 없으므로 주의할 것!
	
		//int z =1;
		//z++; // +1 증가 : 출력 후 +1 증가
		//z--; // -1 감소 : 출력 후 -1 감소
		//++z; // +1 증가 : +1 증가 후 출력
		//--z; // -1 감소 : -1 감소 후 출력
		
		/*반복문
		 * for - 100data까진 문제없었음, 100000data 넘어가니 로딩 걸리기 시작
		 * while - 100000data for보다 빠름
		 * do ~ while - while보다 빠름
		 * foreach
		 * each
		 * map
		 * for ~ in
		 */
		
		//z--;
		//System.out.println(z);
		
		
		//for (초기값; 범위값; 증가 또는 감소)
		/*for (int a=0; a<10; a++) {
			System.out.println(a);
		}
		*/
		int b;
		for(b=5;b<=10; b++) {
		//	System.out.println(b);
		}
		
		int c;
		for(c=10;c>3;c--) { //주의사항 c<3 0~음수까지 전부 찍혀버리는 상황이 발생함
		//	System.out.println(c);
		}
		
		//응용문제 20~27 출력하세요
		
		int d;
		for(d=20; d<28; d++) {
		//	System.out.print(d);
		}
		
		int e;
		for(e=27; e>19; e--) {
		//	System.out.println(e);
		}
		//응용문제 39~21까지 출력
		int f;
		for(f=39; f>20; f--) {
		//	System.out.print(f+",");
		}
		//응용문제 1~10까지 숫자 출력
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
		//	System.out.print(aa+",");
		}
		
		/*응용문제 변수 2개 이용하여 다음 데이터를 출력하시오.
		 * 55~4까지 출력.		
		*/
		int cc;
		int dd=4;
		for(cc=55;cc>=dd;cc--) {
			System.out.print(cc+",");
		}
		
	}

}
