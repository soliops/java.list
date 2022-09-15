package aopmaster;

//데이터베이스 insert, delete, update, select
public interface aop_service {
	public abstract void setDao(aop_dao dao); //setter역할
	public abstract void register() throws Exception;
	public abstract void modify() throws Exception;
	public abstract String insertdb(String data )throws Exception;
	public abstract String deletedb(String data )throws Exception;
	
}
