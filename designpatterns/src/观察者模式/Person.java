package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Person implements Subject{

	private String name;
	private List<Observer> observer =new ArrayList <Observer>();
	@Override
	public void Add(Observer observer) {
		this.observer.add(observer);
		
	}

	@Override
	public void Reduce(Observer observer) {
		this.observer.remove(observer);
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void serName(String string) {
		this.name=string;
		
	}

	@Override
	public void Notify() {
		for(Observer observer:this.observer) {
			observer.update();
		}	
	}

}
