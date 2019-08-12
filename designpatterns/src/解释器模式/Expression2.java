package 解释器模式;

public class Expression2 implements AbstractExpression {

	@Override
	public void explain(Context context) {
		System.out.println("def ");   //转化定义方法语句
	}

}
