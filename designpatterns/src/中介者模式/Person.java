package 中介者模式;

public abstract class Person {
protected Imedium imedium;
protected Person person;
protected String message;
public Person(Imedium imedium) {//设置中介者，对方,消息
	this.imedium=imedium;
}
public void setPerson(Person person) {
	this.person = person;
}
public void setMessage(String message) {
	this.message = message;
}
public abstract void set();
public abstract void get(String message);
}
