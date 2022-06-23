package java_test;

import java.util.Arrays;

public class test1_a {

	public static void main(String[] args) {
		// http://mekeyace.dothome.co.kr/test1.txt
		//실무용 코드
		fs f =new fs();
		f.load();
	}

}
abstract class data{
	public abstract int indexs(int data2[]);
	public abstract void load();
}
class fs extends data{
	static String best = null;
	@Override
	public int indexs (int data2[]) {
		int s = 0;
		int z = 0;
		while(s<data2.length) {
			if(data2[z]<data2[s]) {
				z=s;
			}
			s++;
		}
		return z;
	}
	@Override
	public void load() {
		
		String[] nm = {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		String[] sc = {"65","74","23","75","68","96","88","98","54"};
		int ea = sc.length;
		int sc2[] = new int[ea];
		int w=0;
		while(w<ea) {
			sc2[w]=Integer.parseInt(sc[w]);
			w++;
		}
		int ck = indexs(sc2);
		System.out.printf("1등 : %s %d 점",nm[ck],sc2[ck]);
		
		Arrays.sort(sc2);
		this.best = String.valueOf(sc2[ea-1]).intern();
		int c=0;
		for(String d2 : sc) {
			if(d2 ==this.best) {
				System.out.printf("1등 : %s %s 점\n",nm[c],d2);
			}
			c++;
		}
	}
}