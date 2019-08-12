package 备忘录模式;

public class Originator {
private String state;         //成绩
public void setState(String state) {
	this.state = state;
}
public String getState() {
	return state;
}
public Memento Create() {     //创造备忘录
	return new Memento(state);
}
public void SetMemento(Memento memento) {     //还原
	this.state=memento.getState();
}	
public void show() {
	System.out.println("当前分数"+state);
}
}
