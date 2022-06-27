import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	//UnknownHostException : HOST 정보가 확인 되지 않을 경우
	public static void main(String[] args) throws UnknownHostException{
		/*
		Server + Client
		P2P
		온라인 채팅 : Client -> Server(접속) - >채팅
		1:1 채팅 : P2P
		
		IP : 네트워크 주소
		-IPv4 : 0~255까지 정수 4파트 211.255.1.16 - abc.co.kr(DNS)
		192.168.0.1 -1번은 Gateway(X)
		192.168.0.255 - 255번은 보안접속 페이지
 		보통 2~254쓴다
		-IPv6(보안) : 128bit 단위로 설정 0:0:0:0:0:0:0:0 -> 0110:C002:D010:
//		
		
		*/
		//InetAddress = IpnetworkAddress
		//getByname : 접속할 도메인 주소명을 말합니다.
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);
//		System.out.println(ia);
//		System.out.println(ia.getHostName()); //도메인명
//		System.out.println(ia.getHostAddress());//DNS에 연결된 IP
		
		//getAllByName : 도메인에 IP정보 확인
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length);
		int w = 0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
	}

}
