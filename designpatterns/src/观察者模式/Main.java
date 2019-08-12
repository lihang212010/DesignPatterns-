package 观察者模式;

public class Main {

	public static void main(String[] args) {
		Person p=new Person();
		p.serName("通知人小吴");
		Observer b=new boy("小一", p);
		Observer g=new girl("小妞", p);
		p.Add(b);
		p.Add(g);
		p.Notify();
	}

}
