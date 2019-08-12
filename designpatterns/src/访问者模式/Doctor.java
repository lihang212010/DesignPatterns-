package 访问者模式;

public class Doctor implements Person {

	@Override
	public void show(Action action) {
		action.method2(this);

	}

}
