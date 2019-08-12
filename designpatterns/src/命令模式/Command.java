package 命令模式;

public class Command extends Icommand{

	public Command(Cook cook) {
		super(cook);
	}

	@Override
	public void Excute() {
		cook.make();
		
	}
}
