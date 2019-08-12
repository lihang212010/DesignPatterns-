package 访问者模式;

public class Main {

	public static void main(String[] args) {
		ObjectStructure o=new ObjectStructure();  
		Doctor doctor=new Doctor();           //添加医生
		Businessman b=new Businessman();     //添加商人
      o.Add(doctor);
      o.Add(b);
      Success success=new Success(); //测试成功表现
      o.show(success);
      
      Failed failed=new Failed();     //测试失败表现
      o.show(failed);
	}

}
