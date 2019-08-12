package 适配器模式;

public class Main {

	public static void main(String[] args) {
		Interface a=new American();
		a.hello();
		a=new Translator();
		a.hello();
       
	}
}
