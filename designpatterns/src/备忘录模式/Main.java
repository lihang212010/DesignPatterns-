package 备忘录模式;

public class Main {

	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setState("111");
		originator.show();
		Administration a=new Administration();
		a.setMemento(originator);//设置备忘录
		originator.setState("321");;
		originator.show();
		originator.SetMemento(a.getMemento());//还原数据
		originator.show();
        
	}

}
