package Ab2;
import Ab.method_1; //package Ab���� main class�� �ε���

public class ab2_method extends method_1{
	public static void main(String[] args) {
			//@Override	
			Ab.method_1 at = new Ab.method_1();
			at.main(args); //main �޼ҵ� ����
			at.recall();	//public �޼ҵ� ����
			at.name();	//protected �޼ҵ� ����

	}

}
