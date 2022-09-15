package aopmaster;

public class aop_servicetemp implements aop_service{
	public aop_dao dao;
	
	
	@Override
	public void setDao(aop_dao dao) {
		this.dao=dao;
	}
	@Override
	public String insertdb(String data) throws Exception {
		String sqls = "insert into imgs values('0','"+data+"')";
		return sqls;
	}
	@Override
	public String deletedb(String idx) throws Exception {
		String sqls ="delete from imgs where imdx='"+idx+"'";
		return sqls;
	}
	@Override
	public void register() throws Exception {
		dao.insertmethod();
	}
	
	@Override
	public void modify() throws Exception {
		dao.updatemethod();
		dao.deletemethod();
	}
}
