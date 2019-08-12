package 简单工厂模式;

public class OperationFactory {

	public static Factory creaeFactory(String colour) {
		Factory factory=null;
   switch (colour) {
    case "黑色":
	     factory=new BlackFactory();
	     break;
    case  "红色":
    	  factory=new RedFactory();
	     break;
     }
		return factory;
	}
}
