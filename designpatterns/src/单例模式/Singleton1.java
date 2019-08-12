package 单例模式;

public class Singleton1 {
	private Singleton1(){}
	private static Singleton1 singleton;

	public static Singleton1 getSingleton() {
		if(singleton==null) { 
			synchronized (Singleton1.class) {  //加锁防止被同步访问
				singleton=new Singleton1();
			}
		}
		return singleton;
	}
}
