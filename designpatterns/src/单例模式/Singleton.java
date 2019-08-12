package 单例模式;

public class Singleton {
private Singleton(){}
private static Singleton singleton=new Singleton();

public static Singleton getSingleton() {
	return singleton;
}

}
