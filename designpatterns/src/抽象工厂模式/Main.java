package 抽象工厂模式;

public class Main {

	public static void main(String[] args) {
		AbstractFactory a1=new Factory1();
        IA i1=a1.A();
        i1.A();//调用第1个工厂的方法A
        AbstractFactory a2=new Factory2();
        IB i2=a2.B();
        i2.B();//调用第二个工厂的方法B
               
	}

}
