import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	//UnknownHostException : HOST ������ Ȯ�� ���� ���� ���
	public static void main(String[] args) throws UnknownHostException{
		/*
		Server + Client
		P2P
		�¶��� ä�� : Client -> Server(����) - >ä��
		1:1 ä�� : P2P
		
		IP : ��Ʈ��ũ �ּ�
		-IPv4 : 0~255���� ���� 4��Ʈ 211.255.1.16 - abc.co.kr(DNS)
		192.168.0.1 -1���� Gateway(X)
		192.168.0.255 - 255���� �������� ������
 		���� 2~254����
		-IPv6(����) : 128bit ������ ���� 0:0:0:0:0:0:0:0 -> 0110:C002:D010:
//		
		
		*/
		//InetAddress = IpnetworkAddress
		//getByname : ������ ������ �ּҸ��� ���մϴ�.
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);
//		System.out.println(ia);
//		System.out.println(ia.getHostName()); //�����θ�
//		System.out.println(ia.getHostAddress());//DNS�� ����� IP
		
		//getAllByName : �����ο� IP���� Ȯ��
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length);
		int w = 0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
	}

}
