package 状态模式;

public class Main {

	public static void main(String[] args) {
		Context context=new Context();
		context.setHour(8);
		context.show();
		context.setHour(14);
		context.show();
		context.setHour(20);
		context.show();
       
	}

}
