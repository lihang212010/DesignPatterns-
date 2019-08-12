package 状态模式;

public class Night implements State {

	@Override
	public void Next(Context context) {
			System.out.println("现在时间："+context.getHour()+",状态为夜里睡觉");
	}

}
