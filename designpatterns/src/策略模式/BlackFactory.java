package 策略模式;

public class BlackFactory extends Factory{
	@Override
	public void GetResult(){
		System.out.println("工厂生产黑色签字笔");
	}
}
