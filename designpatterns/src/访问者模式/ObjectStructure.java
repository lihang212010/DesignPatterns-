package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {  //允许客户端通过访问此接口访问人接口下的元素
	private List<Person> persons=new ArrayList<Person>();
	public void Add(Person person) {
		persons.add(person);
	}
	public void Reduce(Person person) {
		persons.remove(person);
	} 
	public void show(Action action) {
		for (Person person : persons) {
			person.show(action);
		}
	}

}
