package 组合模式;

public abstract class Bird {
protected String name;
public Bird(String name) {
	this.name=name;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public abstract void Add(Bird bird);
public abstract void Remove(Bird bird);
public abstract void Show(int depth); 
}
