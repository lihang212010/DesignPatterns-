package 抽象工厂模式;

public class Factory1 implements AbstractFactory{

	@Override
	public IA A() {	
		return new A1();
	}

	@Override
	public IB B() {
		return new B1();
	}

}
