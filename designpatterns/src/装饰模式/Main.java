package 装饰模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("装饰模式");
         Person person=new Person();
         Dress dress=new Dress();
         Trousers trousers=new Trousers();
         Shoes shoes=new Shoes();
         dress.Decorate(person);
         trousers.Decorate(dress);
         shoes.Decorate(trousers);
         shoes.show();
	}
}
