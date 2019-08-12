package 中介者模式;

public class Medium implements Imedium {

	@Override
	public void Declare(String message, Person person) {
		person.get(message);		
	}
	

}
