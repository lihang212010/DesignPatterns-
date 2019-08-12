package 装饰模式;

public class Shoes extends Clothes{
	
	@Override
	public void show() {
		super.show();
		System.out.print("鞋子");
	}

}
