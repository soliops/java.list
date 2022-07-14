public class thread2 {
	//Thread는 순차적으로 결과값이 절대 안나옴
	public static void main(String[] args) {
		/*응용문제 Thread를 이용하여 각 배열의 값을 내림차순으로 
		 * 모두 더하여 결과를 출력하는 응용프로그램을 제작하시오.*/
		Integer data[] = {6,9,10,15,3,17};
		/* 힌트: 6이라는 배열값이 인수값으로 Thread로 전달
		 6+5+4+3+1 최종결과값만 print =>21
		 최종결과값 : 
		 */
		
		int ea = data.length;
		plusbox pb = null;
		for(int a=0;a<ea;a++) {
			pb = new plusbox(data[a]);
			pb.start();			
		}
	}

}
class plusbox extends Thread{
	int number=0;
	public plusbox(int no) { //Thread에서 값을 사용하기 위한 기본 메소드를 사용함
		this.number = no;
	}
	@Override
	public void run() {//run 메소드는 절대 인수값을 못받음
		//반복문
		int sum =0;
		for(int z = this.number;z>0;z--) {
			sum+=z;
		}
		System.out.println(sum);
	}
}