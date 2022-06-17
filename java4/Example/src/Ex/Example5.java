package Ex;

public class Example5 {

	public static void main(String[] args) {
		/*
		 응용문제
		 abstract을 이용하여 구구단 8단 결과를 모두 더한 결과값을 
		 return을 받아 메인에서 출력되도록합니다.
		 */
		gugudan gg = new gugudan();
		gg.setter(8);
		System.out.println("해당 구구단의 총 합은 : "+gg.getter()+" 입니다.");
	}

}
abstract class gugu{
	public abstract void setter(int num);
	public abstract int getter();
}
class gugudan extends gugu{
	int un;
	int total = 0;
	@Override
	public void setter(int num) {
		this.un = num;
		int w=1;
		do {
		this.total+=this.un*w;
			w++;
		}while(w<10);
	}
	@Override
	public int getter() {
		return this.total;
	}
}