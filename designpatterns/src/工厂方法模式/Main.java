package 工厂方法模式;

public class Main {

	public static void main(String[] args) {
		
AbstractFactory factory=new RedFactory();
Factory c=factory.create();
c.GetResult();
	}

}
