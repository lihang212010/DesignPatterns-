package 访问者模式;

public class Success implements Action {

	@Override
	public void method1(Businessman businessman) {
		System.out.println("商人通过卖东西获得成功");

	}

	@Override
	public void method2(Doctor doctor) {
		// TODO Auto-generated method stub
  System.out.println("医生通过治病获得了成功");
	}

}
