package 解释器模式;
/*这个类无实际作用，只是为了告诉你
 * 如果有解释器外的全局信息，可以建类存放*/
public class Context {  
private String name;
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
}
