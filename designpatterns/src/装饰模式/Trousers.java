package 装饰模式;

public class Trousers extends Clothes{
	
	@Override
	public void show() {
		super.show();
		System.out.print("裤子");
	}

}
