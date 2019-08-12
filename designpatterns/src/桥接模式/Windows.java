package 桥接模式;

public class Windows extends System1{

	@Override
	public void Run() {
		System.out.print("Windows");
		software.Run();
		
	}

}
