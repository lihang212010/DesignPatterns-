package 策略模式;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     OperationFactory operationFactory=new OperationFactory(new RedFactory());
     operationFactory.ContextInterface();
	}

}
