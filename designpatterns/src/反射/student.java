package 反射;

public class student {
	private String name;
	private int age;
	public student(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void show() {
		System.out.println("姓名："+name+"  年龄"+age);
	}
}
