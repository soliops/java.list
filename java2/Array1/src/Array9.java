import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*
		���빮�� 2���� ������ �迭�� �ֽ��ϴ�. �ش� ������ �迭�� 
		���� ��� ó�� ���� ����Ͻÿ�.
		
		1�� DATA : ���ѹα� �Ϻ� �߱� ��Ʈ�� �±�
		2�� DATA : 40 35 70 55 32
		��� DATA :
		["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"]
		 
		 *���  = ���� +"("+����+")";
		 */
		
		String data[][]= {
				{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
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
		}while(w==0);  //==0���� �ϸ� 1���� ������ ����
		
		System.out.println(Arrays.toString(newdata));
		
		
		/*
		 * ���빮��
		 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�.
		 * �� �迭���� �ε����� ���� ��ȣ�� ���ؼ�
		 * ¦��, Ȧ�� ������ �迭 ��� �����ͷ� �缳�� �մϴ�.
		 * A data = 5 17 19 22 33
		 * B data = 1 2 3 4 5 
		 * Result = ["¦��","Ȧ��","¦��","¦��","¦��"]
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
				result="¦��";
			}else {result = "Ȧ��";
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
					newdata3[tt]="¦��";
				}
				else
					newdata3[tt]="Ȧ��";
				tt++;
			}while(tt<dr2);
		
			t++;
		}while(t<dr);
		
		System.out.println(Arrays.toString(newdata3));
		
		
	}

}
