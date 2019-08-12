package 中介者模式;

public class Boss extends Person{

	public Boss(Imedium imedium) {
		super(imedium);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void set() {
		imedium.Declare(message, person);			
	}

	@Override
	public void get(String message) {
		System.out.println("老板接受到:"+message);
		
	}

}
