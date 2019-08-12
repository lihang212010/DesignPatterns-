package 备忘录模式;

public class Administration {
private Memento memento;          //备忘录
public void setMemento(Originator originator) {
	this.memento = originator.Create();
}
public Memento getMemento() {
	return memento;
}
}
