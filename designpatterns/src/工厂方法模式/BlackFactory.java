package 工厂方法模式;

public class BlackFactory implements AbstractFactory{

	@Override
	public Factory create() {
		// TODO Auto-generated method stub
		return new BlackCreate();
	}

}
