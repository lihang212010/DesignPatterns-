package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Real_Bird extends Bird{
   public Real_Bird(String name) {
	  super(name);
}
	private List<Bird> list=new ArrayList<Bird>();
	@Override
	public void Add(Bird bird) {
		list.add(bird);	
	}

	@Override
	public void Remove(Bird bird) {
		list.remove(bird);
	}
	
	@Override
	public void Show(int depth) {
		System.out.println(name+",第"+depth+"代");
	    for (Bird bird : list) {
			     bird.Show(depth+1);
		}	
	}
}
