package 原型模式;

public class Book extends Prototype{
private String name;
private Major major;

public Book(String name){
	this.name=name;
	this.major=new Major();
}
private Book(Major major) {//内部调用复制专业
	this.major=major.clone();
}
public void setMajor(String m) {
	this.major.setMajor(m); ;
}
public void setName(String name) {
	this.name = name;
}
public Book clone() {
	Book book=new Book(this.name);
	return book;
} 
public void show() {
	System.out.println("学校："+name+","+"专业:"+major.getMajor());
}
}
