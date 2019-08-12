package 解释器模式;

public class Expression1 implements AbstractExpression {

	@Override
	public void explain(Context context) {
	System.out.println("print()");   //转化java输出语句
	}
}
