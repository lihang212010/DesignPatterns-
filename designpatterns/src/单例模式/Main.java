package 单例模式;

public class Main {

	public static void main(String[] args) {
		Singleton1 s1=Singleton1.getSingleton();
		Singleton1 s2=Singleton1.getSingleton();
		System.out.print(s1==s2);
	}
}
