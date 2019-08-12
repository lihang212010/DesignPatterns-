package 代理模式;

public class Girl implements Proxy{
  Boy boy;
 public Girl() {
	 
	boy=new Boy();
}
	@Override
	public void Give() {
		// TODO Auto-generated method stub
		boy.Give();
	}
}
