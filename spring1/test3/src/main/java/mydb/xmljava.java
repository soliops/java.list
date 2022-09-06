package mydb;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

//xml + controller + module
@Repository("xmlj") //해당 메소드 모두를 시스템 메모리 저장소 기억시킴
public class xmljava {
	
	//@Autowired : 특정값을 입력 받아 처리가 가능한 template이며,
	//@Resource와 : 전체에 대한 template 만 이용
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate session; //sql문법을 실행하기 위한 변수셋팅
	
	//※ xml에서 사용하는 id값이 중복 또는 오타가 발생할 경우 연결되지 않습니다.
	
	//selectList : 여러개의 데이터를 가져올 때
	//selectOne : 1개의 데이터만 가져올 때 
	
	//사용자 전체 리스트
	//모든 sql 문법코드는 xml에 있는 namespace.id를 이용하게 됩니다.
	//select에 관련된 메소드는 getter, setter에 이용되는 class명을 이용
	public List<uservo> selectall(){
		List<uservo> userlist = session.selectList("userDB.selectall");
		return userlist;
	}
	
	//사용자에 대한 정보만 출력
	public uservo selectid (String id){
		uservo user = session.selectOne("userDB.selectid",id);
		return user;
	}
	
	//사용자에 대한 나이에 해당 되는 범위만 출력
	public List<uservo> selectage(int age) { 
		//값을 보낼 경우 selectList("연결 ID", 전송할 값) 
		List<uservo> userlist = session.selectList("userDB.selectage",age);
		return userlist;
	}
	
	//사용자값 입력 파트
	public String userinsert(String mid, String mpw, String mnm, String mtel, String mage) {
		uservo vo = new uservo();
		vo.setMid(mid);
		vo.setMpw(mpw);
		vo.setMnm(mnm);
		vo.setMtel(mtel);
		vo.setMage(mage);
		session.insert("userDB.userinsert",vo);
		String sign = "ok";
		return sign;
	}
	
	public String userupdate(String mid, String mpw, String mnm) {
		uservo vo = new uservo();
		vo.setMid(mid);
		vo.setMpw(mpw);
		vo.setMnm(mnm);
		session.insert("userDB.userupdate",vo);
		String sign = "ok";
		return sign;
	}
	
	public String userdelete (String mid, String mpw, String mnm) {
		uservo vo = new uservo();
		vo.setMid(mid);
		vo.setMpw(mpw);
		vo.setMnm(mnm);
		session.insert("userDB.userdelete",vo);
		String sign = "ok";
		return sign;
	}
}
