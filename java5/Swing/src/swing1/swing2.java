package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList (�迭��) add, remover,get,size 
		//Map(�迭Ű, �迭��)
		//Map�� �迭Ű�� ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ�� �մϴ�.(�ӵ� �ֻ��)
		//���� Ű�� ���� �������� ����� ������ ���� �˴ϴ�.
		// Ű���� ���� �ߺ� ��Ű�� ����
		Map<String,String>  m = new HashMap<>();
		//hong -> Hash function(HashmMap)	0x21949CB(�ߺ����� �߻����� ����)
		m.put("hong", "ȫ�浿");
		m.put("kang", "������");
		System.out.println(m.get("hong"));
		m.put("", "�����ż�"); //����ִ� Ű�� ����� �� �� ������, Map�� �������� �ùٸ��� ����
		m.put("park", ""); //Ű�� ������ ���� ������� ���� ����
		if(m.get("park").equals("")) {
			m.put("park", "��");	
		}
		System.out.println(m.get("park"));
		m.remove("hong");
		System.out.println(m);
		
		//Map : �������� �ڷ����� ����� �� ����
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2.get("level"));
		System.out.println(m2.keySet()); //Ű�� ���
		System.out.println(m2.values()); //���� ���
		System.out.println(m2.containsKey("age")); 
		//�ش� Ű�� �ִ��� Ȯ�� (false : ����, true : ����)
		System.out.println(m2.containsValue(10)); 
		//�ش� ���� �ִ��� Ȯ�� (false : ����, true : ����)

	}

}
