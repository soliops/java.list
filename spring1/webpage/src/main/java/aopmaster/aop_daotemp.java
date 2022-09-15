package aopmaster;

public class aop_daotemp implements aop_dao{
	
	@Override
	public void insertmethod() throws Exception {
		Thread.sleep(3000);
	}
	@Override
	public void updatemethod() throws Exception {
		Thread.sleep(5000);
	}
	@Override
	public void deletemethod() throws Exception {
		Thread.sleep(4000);
	}
}
