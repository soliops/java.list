package Java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		subject sb = new subject();
		sb.setter();

	}

}
class subject extends test1_abstract{
	String user=null;
	Scanner sc =new Scanner(System.in);;
	public String[] sublist = {"국어","영어","수학","과학","사회"};
	ArrayList<String> list = new ArrayList<>(Arrays.asList(sublist));
	
@Override
	public void setter() {
	
	System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 를 선택해 주세요? ");

	String input = sc.next();
	if(input =="종료	") {
		sc.close();
		System.exit(0);
	}
	if(Integer.parseInt(input) ==1) {
		System.out.println("추가할 과목명을 입력하세요?");
		this.setter2();
	}
	else if(Integer.parseInt(input) == 2) {
		System.out.println("삭제할 과목명을 입력하세요?");
		this.setter3();
	}else if (Integer.parseInt(input) ==3 ) {
		System.out.println(this.list);
	}
	
	this.setter();
}
@Override
public void setter2() {
	this.user= sc.next();
	int wea = this.list.size();
	int w=0;

		if(!this.list.contains(this.user)) {
			do {
			this.list.add(this.user);
			w++;
			}while(w<wea);
			System.out.println("정상적으로 등록 되었습니다.");
			}else {
				System.out.println("이미 등록된 과목명이 있습니다.");			
			}
}
@Override
public void setter3() {
	this.user= sc.next();
	int uea = this.list.size();
	int z=0;
		if(this.list.contains(this.user)) {
			do {
			this.list.remove(this.user);
			z++;
			}while(z<uea);
			System.out.println("정상적으로 삭제 되었습니다.");
			}else {
				System.out.println("해당 과목명이 없습니다.");			
			}
}
}
