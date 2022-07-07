import java.util.ArrayList;

public class study5 {
//5-1 랜덤 숫자 5개 뽑아서 중복값 없는 배열
	public static void main(String[] args) {
		randomarray rd = new randomarray();
		rd.array();
		System.out.println((rd.getter()));
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