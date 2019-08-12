package 简单工厂模式;

public class RedFactory extends Factory{

	@Override
	public void GetResult() {
		System.out.println("工厂生产红色签字笔");
	}
}
