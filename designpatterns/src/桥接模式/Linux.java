package 桥接模式;

public class Linux extends System1{
	@Override
	public void Run() {
		System.out.print("Linux");
		software.Run();
		
	}
}
