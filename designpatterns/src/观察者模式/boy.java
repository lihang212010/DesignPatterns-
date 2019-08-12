package 观察者模式;

public class boy extends Observer{

	public boy(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println(name+"接受到"+subject.getName());	
	}

}
