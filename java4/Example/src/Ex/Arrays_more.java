package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_more {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String memeber_data[][]={
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"}
			};
		//String[] : 2�� �迭 �̻� Integer[] : 2���迭 �̻�
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(memeber_data));
		int w= 0;
		while(w<list.size()) {
			System.out.println(list.get(w)[2]);
			w++;
		}
		/*
		String member_data[][] = new String[][] {
			{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			{"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			{"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"}
		};
		//String[] : 2���迭 �̻�  Integer[] : 2���迭 �̻�
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
		int w = 0;
		while(w < list.size()) {
			System.out.println(list.get(w)[2]); //.get(�ݺ���)[�ε��� ����]
			w++;
		}
		*/
	}

}