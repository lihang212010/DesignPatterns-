package 职责链模式;

public abstract class Controller {   //管理者抽象接口
protected String name;
protected Controller controller;
public Controller(String name) {
	this.name=name;
}
public void setController(Controller controller) {
	this.controller=controller;
}
public abstract void Response(Request request);
}
