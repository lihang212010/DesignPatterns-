package 组合模式;

public class Wing extends Bird{

	public Wing(String name) {
		super(name);
	}
	
	@Override
	public void Add(Bird bird) {
		System.out.println("这是翅膀，不需要这个方法");
	}

	@Override
	public void Remove(Bird bird) {
		System.out.println("这是翅膀，不需要这个方法");
	}

	@Override
	public void Show(int depth) {
		System.out.println(name+",第"+(depth-1)+"代的翅膀");
	}

}
