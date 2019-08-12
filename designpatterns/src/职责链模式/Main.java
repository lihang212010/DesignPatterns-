package 职责链模式;

public class Main {

	public static void main(String[] args) {
		Manager manager=new Manager("经理");
		Boss boss=new Boss("老板");
		manager.setController(boss);
		Request request=new Request("请假");
		Request request2=new Request("涨工资");
		manager.Response(request);
		manager.Response(request2);
       
	}

}
