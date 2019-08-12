package 备忘录模式;

public class Memento {
public String state;
public Memento(String state) {
	this.state=state;
}
public String getState() {
	System.out.println("正在还原");
	return state;
}
}
