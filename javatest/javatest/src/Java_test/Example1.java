package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) throws IOException,Exception {
		/*
		 응용문제
		 사용자가 6개의 숫자를 입력하는 로또 프로그램 입니다.
		 프로세서 시작시 "숫자를 입력해 주세요: " 를 6번의 숫자를 입력 받게 됩니다.
		 그리고 lotto.txt 결과를 가진 파일을 로드 하여 사용자가 입력한 값과
		 결과를 비교하여 몇개를 맞췄는지를 검토하는 프로그램 코드를 작성하시오.
		 
		 [결과 예시]
		 로또 결과 : 총 3개의 번호를 맞추셨습니다.
		 */
		lotto tto = new lotto();
		tto.start();
		System.out.println(tto.getter());
	}
	
}
class lotto{
	FileReader fr = null;
	String fname = null;
	ArrayList<String> lottonum = null;
	Scanner sc = null;
	int count = 0;
	int usernum= 0;
	public void start()throws IOException,Exception {
		this.fname = "C:\\javatest\\javatest\\src\\Java_test\\lotto.txt";
		this.fr = new FileReader(this.fname,Charset.forName("EUCKR"));
		BufferedReader br = new BufferedReader(this.fr);
		this.lottonum = new ArrayList<>();
		String ltnum = br.readLine();
		do {
			this.lottonum.add(ltnum);
		}while((ltnum=br.readLine())!=null);
		System.out.println(this.lottonum);
		this.number();
	}
	public void files () {
		
	}
	public void number ()throws Exception {
		this.sc = new Scanner(System.in);
		try {
		int w= 0;
		do {
			System.out.println("숫자를 입력해주세요.");
			this.usernum = this.sc.nextInt();
			if(this.usernum==Integer.valueOf(this.lottonum.get(w))) {
				this.count++;
			}
			w++;
		}while(w< this.lottonum.size());
		}
		catch (Exception e) {
			System.out.println("숫자를 입력하세요");
			this.number();
		}
	}
	public String getter() {
		String msg = "로또 결과 : 총 "+this.count+" 개를 맞추셨습니다.";
				return msg;
	}
}