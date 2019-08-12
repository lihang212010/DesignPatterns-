package 访问者模式;

public class Businessman implements Person {

	@Override
	public void show(Action action) {
		action.method1(this);

	}

}
