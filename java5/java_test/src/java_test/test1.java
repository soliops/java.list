package java_test;

public class test1 {

	public static void main(String[] args) {
		// http://mekeyace.dothome.co.kr/test1.txt
		try {
			score sc = new score();
			sc.setter();
			System.out.println(sc.getter());
		}catch (Exception e) {
			if(e.getMessage()!=null){
			System.out.println(e.getMessage());
			}
			
		}
	}

}
abstract class aclass{
	public String[][] score=null;
	public abstract void setter();
	public abstract String getter();
}
class score extends aclass{
	private int ea,max,scores;
	String name=null;
	String msg=null;
	public String[][] score = {
			{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
			{"65","74","23","75","68","96","88","98","54"}
			};
	@Override
	public void setter() {
		try {
		int w = 0;
		this.ea = score[0].length;
		this.max = Integer.parseInt(this.score[1][0]);
		do {
			if(Integer.parseInt(this.score[1][w])>this.max) {
				this.max = Integer.parseInt(this.score[1][w]);
				this.name = this.score[0][w];
				this.scores = this.max;
			}
			w++;
		}while(w<ea);
		this.getter();
		}
		catch (Exception a) {
			if(a.getMessage()!=null){
				System.out.println(a.getMessage());
				}
		}
	}
	@Override
	public String getter() {
		this.msg= "1µî : "+this.name+"("+this.scores+")";
		return this.msg;
	}
	
}