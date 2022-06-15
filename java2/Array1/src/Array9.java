import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*
		응용문제 2개의 데이터 배열이 있습니다. 해당 데이터 배열을 
		다음 결과 처럼 값을 출력하시오.
		
		1번 DATA : 대한민국 일본 중국 베트남 태국
		2번 DATA : 40 35 70 55 32
		결과 DATA :
		["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		 
		 *결과  = 문자 +"("+숫자+")";
		 */
		
		String data[][]= {
				{"대한민국","일본","중국","베트남","태국"},
				{"40","35","70","55","32"}
		};
		int ar= data.length;
		int ar2=data[0].length;
		String newdata[] = new String[ar2];
		int w=0;
		do {
			int ww=0;
			do {
				//System.out.println(data[w][ww]);
				newdata[ww]= data[0][ww] +"("+data[1][ww]+")";
				ww++;
			}while(ww<ar2);
			
			w++;
		}while(w==0);  //==0으로 하면 1바퀴 돌리고 끝남
		
		System.out.println(Arrays.toString(newdata));
		
		
		/*
		 * 응용문제
		 * 해당 두개의 배열 데이터가 있습니다.
		 * 각 배열별로 인덱스가 같은 번호를 더해서
		 * 짝수, 홀수 인지를 배열 결과 데이터로 재설정 합니다.
		 * A data = 5 17 19 22 33
		 * B data = 1 2 3 4 5 
		 * Result = ["짝수","홀수","짝수","짝수","짝수"]
		 * 
		 */
		//single loop
		int A1[][]={
		 		{5,17,19,22,33},
		 		{1,2,3,4,5}
		};
		int data_ea=A1[0].length;
		int f=0;
		int total;
		String result;
		String result_data[]= new String[data_ea];
		while(f<data_ea) {
			total=A1[0][f]+A1[1][f];
			if(total%2==0) {
				result="짝수";
			}else {result = "홀수";
			}
			result_data[f]=result;
			f++;
		}
		System.out.println(Arrays.toString(result_data));
	
		
		
		int data1[][] = {
				{5,17,19,22,33,27,10},
				{1,2,3,4,5,6,7}
		};
		int dr =data1.length;
		int dr2 = data1[0].length;
		int newdata2[]=new int[dr2];
		String newdata3[]= new String[dr2];
		int t =0;
		do {
			int tt=0;
			do {
				newdata2[tt]=data1[0][tt]+data1[1][tt];
				if(newdata2[tt]%2==0) {
					newdata3[tt]="짝수";
				}
				else
					newdata3[tt]="홀수";
				tt++;
			}while(tt<dr2);
		
			t++;
		}while(t<dr);
		
		System.out.println(Arrays.toString(newdata3));
		
		
	}

}
