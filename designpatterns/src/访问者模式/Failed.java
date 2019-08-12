package 访问者模式;

public class Failed implements Action {

	@Override
	public void method1(Businessman businessman) {
		System.out.println("商人没有卖出去东西失败了");

	}

	@Override
	public void method2(Doctor doctor) {
		System.out.println("医生没有治好病人失败了");
	}

}
