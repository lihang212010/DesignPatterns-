package 适配器模式;

public class Translator implements Interface {
    
	private Chinese chinese;
 public Translator() {
		chinese=new Chinese();
	}
	@Override
	public void hello() {
		chinese.你好();
	}

}
