package 解释器模式;

public class Main {

	public static void main(String[] args) {
		Context context=new Context();   
		AbstractExpression a;        
		String java1="void";    //2个测试数据
		String java2="System.out.println()";
   if (java1.equals("void")) {      //测试转换void
	         a=new Expression2();
	         a.explain(context);
   }
   if(java2.equals("System.out.println()")) { //测试转换输出
	   a=new Expression1();
	   a.explain(context);
   }

	}
}
