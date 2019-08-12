package 桥接模式;

public class Main {
public static void main(String[] args) {
	System1 s1=new Windows();
	s1.setSoftware(new Browser());
	s1.Run();
	
	System1 s2=new Linux();
	s2.setSoftware(new player());
	s2.Run();
}
}
