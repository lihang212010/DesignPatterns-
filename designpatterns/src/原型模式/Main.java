package 原型模式;

public class Main {

	public static void main(String[] args) {
		Book a=new Book("××学院");
		a.setMajor("计算机科学");
		Book b=a.clone();
		b.setMajor("物联网");
		Book c=a.clone();
		c.setMajor("网络工程");
       a.show();
       b.show();
       c.show();
	}

}
