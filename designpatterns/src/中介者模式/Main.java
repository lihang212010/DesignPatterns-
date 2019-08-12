package 中介者模式;

public class Main {

	public static void main(String[] args) {
		Medium medium=new Medium(); //添加中介者
		Boss boss=new Boss(medium);  //设置老板
		Nanny nanny=new Nanny(medium);  //设置保姆
		boss.setPerson(nanny);       //设置中介者服务对象
		nanny.setPerson(boss);  
		boss.setMessage("我想找个保姆");
		boss.set();
		nanny.setMessage("我的工资是2千");
		nanny.set();

	}

}
