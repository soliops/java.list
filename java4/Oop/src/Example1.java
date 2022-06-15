
public class Example1 {

	public static void main(String[] args) { //외부 클래스 호출만 합니다.
		/*
		abstract 응용문제
		
		1차 배열값이 있습니다. 해당 배열값을 모두 더한 값을 출력합니다.
		단, abstract 기본 void 이름은 sender 가지고 있습니다.
		최종 값 출력은 sender에서 출력 되도록 합니다.
		배열은 abstract에서 사용합니다.
		배열 데이터 : 6,13,22,9,12,64,32,47,39 
		 */
		send_a sum = new send_b();    //부모클래스=자식클래스
		sum.sender();
	}

}
abstract class send_a{
	public int array[]= {6,13,22,9,12,64,32,47,39}; //추상클래스 배열 array
	public int total;
	public abstract void sender(); //추상 메소드 sender
	
}
class send_b extends send_a{
private int ar[];
private int ea;
private int total1=0;
	@Override
	public void sender() {
		this.ar=array;				//배열 가져오기
		this.ea=this.ar.length;		//배열 길이
		
		this.total1=total;			
		int w=0;
		do {
			this.total1+=this.ar[w];//합계
			w++;
		}while(w<this.ea);
		System.out.println("최종 값 : "+this.total1); //결과

	}

}