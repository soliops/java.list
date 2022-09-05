package mydb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class uservo {
	private String midx; 	//자동증가값 
	private String mid; 	//아이디
	private String mpw;		//패스워드
	private String mnm;		//사용자명
	private String mtel;	//연락처
	private String mage;	//나이
}
