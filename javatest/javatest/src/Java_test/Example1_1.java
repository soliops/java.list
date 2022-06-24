package Java_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1_1 {

	public static void main(String[] args) {
		lotto2 lt =new lotto2();
		lt.setter();

	}

}
class lotto2{
	Scanner sc =null;
	LinkedList<Integer> k = null;
	String url = "C:\\javatest\\javatest\\src\\Java_test\\lotto.txt";
	public void setter() {
		try {
		this.fileload();
		}catch (Exception e) {
		}
	}
	public String getter() {
		return null;
	}
	public void fileload() throws IOException{
		try {
			InputStream fi =new FileInputStream(this.url);
			System.out.println(fi.available());
			byte[] temp = new byte[fi.available()];
			int ea = fi.read(temp);
			String test = new String(temp,0,ea);
			System.out.println(test);
			//반복문 이용해서 LinkedList 추가
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}