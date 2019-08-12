package 策略模式;

public class OperationFactory {
    Factory factory;
    public OperationFactory() {super();}
	   public OperationFactory(Factory factory) {
		 this.factory=factory;
	}
    public void ContextInterface() {
    	factory.GetResult();
    }
}
