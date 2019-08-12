package 职责链模式;

public class Boss extends Controller{

	public Boss(String name) {
		super(name);
	}

	@Override
	public void Response(Request request) {
		System.out.println(name+"批准了这个请求");
	}

}
