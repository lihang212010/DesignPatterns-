package 简单工厂模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Factory factory;
    factory=OperationFactory.creaeFactory("红色");
    factory.GetResult();
	}

}
