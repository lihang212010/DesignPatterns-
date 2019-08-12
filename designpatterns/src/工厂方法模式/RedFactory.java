package 工厂方法模式;

public class RedFactory implements AbstractFactory {

	@Override
	public Factory create() {
		return new RedCreate();
	}

}
