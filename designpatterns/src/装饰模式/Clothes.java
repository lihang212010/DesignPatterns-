package 装饰模式;

public class Clothes extends Person{
	
	protected Person person;
	
	public void Decorate(Person person) {
		this.person=person;
	}
	
	@Override
	public void show() {
		person.show();
	}

}
