import java.util.Arrays;
import java.util.HashMap;

public class word {
	public static void main(String[] args) {
	 word b = new word();
	System.out.println(Arrays.toString(b.solution()));
	}
String b=null;
public int[] solution() {
	int[] lottos= {0,0,45,1,5,19}; 
	int[] win_nums= {31,10,45,1,6,19};
    int[] answer = new int[2];
    int[] number= {6,6,5,4,3,2,1};
    int num = 7;
    int num2 = 6;
    int count=0;
    int zero=0;
    for(int f=0; f<win_nums.length; f++){     
    	if(lottos[f]==0) {
    		zero++;
    	
    	}
    	for(int ff=0; ff<win_nums.length;ff++) {
    		if(win_nums[f]==lottos[ff]) {
    			count++;
    		}else {
    			
    		}
    	}
    }
    answer[0]=number[count];
    answer[1]=number[count]-zero;
    return answer;
}
}
