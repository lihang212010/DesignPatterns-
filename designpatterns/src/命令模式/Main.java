package 命令模式;

public class Main {

	public static void main(String[] args) {
		Waiter waiter=new Waiter();   //添加服务员
		Cook cook=new Cook();  //添加厨师
		Command command=new Command(cook);  //添加菜单并对应厨师
		waiter.setList(command);   //点菜
		waiter.Notify();   //执行操作

	}

}
