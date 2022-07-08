import java.util.ArrayList;

public class study5 {
//5-1 랜덤 숫자 5개 뽑아서 중복값 없는 배열
	public static void main(String[] args) {
		//빈 배열을 이용한 풀이
		randomarray rd = new randomarray();
		rd.array();
		System.out.println((rd.getter()));
		//boolean 이용한 풀이
		randomarray2 ar2 =new randomarray2();
		ar2.ar2();
		
	}

}

class randomarray {
	ArrayList<Integer> ar = null;
	ArrayList<Integer> total = null;
	int pcnum;

	public void array() {
		this.ar = new ArrayList<Integer>();
		int num = 0;
		do {
			this.pcnum = (int) (Math.random() * 10);
			this.ar.add(this.pcnum);
			num++;
		} while (num < 5);
		this.getter();

	}

	public String getter() {
		this.total = new ArrayList<Integer>();
		int w = 0;
		while (w < this.ar.size()) {
			if (!this.total.contains(this.ar.get(w))) {
				this.total.add(this.ar.get(w));
			}
			w++;
		}
		return this.total.toString();
	}
}
class randomarray2{
	ArrayList<Integer> ar = null;
	boolean check = false;
	public void ar2() {
		this.ar = new ArrayList<>();
		for(int g=0; g<5;g++) {
			int p = (int)(Math.random()*10);
			if(this.call(p)){				
			}else {				
				this.ar.add(p);
			}			
			
		}
		System.out.println(this.ar);
	}
	public boolean call(int a) {
		if(this.ar.contains(a)) {
		return true;
		}
		else {
			return false;
		}
	}	
}