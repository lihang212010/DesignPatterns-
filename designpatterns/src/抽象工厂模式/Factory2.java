package 抽象工厂模式;

public class Factory2 implements AbstractFactory{

	@Override
	public IA A() {
		return new A2();
	}

	@Override
	public IB B() {
		return new B2();
	}

}
