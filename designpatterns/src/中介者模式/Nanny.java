package 中介者模式;

public class Nanny extends Person{


	public Nanny(Imedium imedium) {
		super(imedium);
	}

	@Override
	public void set() {
		imedium.Declare(message, person);	
	}

	@Override
	public void get(String message) {
		System.out.println("保姆接受到:"+message);
		
	}

}
