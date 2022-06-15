package Ab2;

public interface home {
	int bk = 80;	//80이상 이면 고장으로처리
	public void poweron(); //가동
	public void poweroff();//꺼짐
	public void broken(int n);  //고장
}
