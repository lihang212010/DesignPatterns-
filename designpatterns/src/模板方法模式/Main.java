package 模板方法模式;

public class Main {
	public static void main(String[] args) {
		AbstractClass A;
		A=new A();
		A.show();
		A=new B();
		A.show();
	}
}
