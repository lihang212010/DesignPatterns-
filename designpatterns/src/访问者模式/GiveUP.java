package 访问者模式;

public class GiveUP implements Action {

	@Override
	public void method1(Businessman businessman) {
		System.out.println("商人没钱放弃了");

	}

	@Override
	public void method2(Doctor doctor) {
		System.out.println("医生没药放弃了");

	}

}
