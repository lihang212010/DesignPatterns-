package 职责链模式;

public class Manager extends Controller{//经理

	public Manager(String name) {
		super(name);
	}

	@Override
	public void Response(Request request) {
		if(request.getRequest().equals("请假")) {
			System.out.println(name+"批准了请假");
		}
		else {
			System.out.println(name+"无权处理"+request.getRequest()+"，将其报告给了上级");
			controller.Response(request);
		}	
	}  
}
