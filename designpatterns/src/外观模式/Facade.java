package 外观模式;

public class Facade {

	A a;
	B b;
	public Facade() {
		 a=new A();
		 b=new B();
	}
	public void method1() {
		a.method();
		b.method();
	}
	public void method2() {
		b.method();
		a.method();
	}
}
