package aopmaster;

//각각의 메소드를 미리 셋팅하는 공간
public interface aop_dao {
	public abstract void insertmethod() throws Exception;
	public abstract void updatemethod() throws Exception;
	public abstract void deletemethod() throws Exception;
}
