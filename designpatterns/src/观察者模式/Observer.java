package 观察者模式;

public abstract class Observer {

	protected String name;
	protected Subject subject;
	public Observer(String name,Subject subject) {
		this.name=name;
		this.subject=subject;
	}
	public abstract void update() ;
	
}
