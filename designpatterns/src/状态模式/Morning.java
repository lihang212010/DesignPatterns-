package 状态模式;

public class Morning implements State{

	@Override
	public void Next(Context context) {
		if(context.getHour()<=11&context.getHour()>=6) {
			System.out.println("现在时间："+context.getHour()+",状态为早起");
		}
		else {
			context.setState(new Afternoon());
			context.show();
		}
	}
	

}
