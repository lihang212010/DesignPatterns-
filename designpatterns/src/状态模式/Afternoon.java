package 状态模式;

public class Afternoon implements State {

	@Override
	public void Next(Context context) {
		if(context.getHour()<=18&context.getHour()>=12) {
			System.out.println("现在时间："+context.getHour()+",状态为下午工作");
		}
		else {
			context.setState(new Night());
			context.show();
		}
	}

}
