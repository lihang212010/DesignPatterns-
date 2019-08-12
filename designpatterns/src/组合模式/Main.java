package 组合模式;

public class Main {

	public static void main(String[] args) {
		Real_Bird a=new Real_Bird("凤凰"); //凤凰
		a.Add(new Wing("凤凰的翅膀"));
        
		Real_Bird b=new Real_Bird("孔雀");
		b.Add(new Wing("孔雀的翅膀"));
		a.Add(b);
       
		Real_Bird c=new Real_Bird("大鹏");
		c.Add(new Wing("大鹏的翅膀"));
		b.Add(c);
		
		Real_Bird d1=new Real_Bird("苍鹰");
		d1.Add(new Wing("苍鹰的翅膀"));
		Real_Bird d2=new Real_Bird("雀鹰");
		d2.Add(new Wing("雀鹰的翅膀"));
		c.Add(d1);
		c.Add(d2);
	
		a.Show(1);
	}

}
