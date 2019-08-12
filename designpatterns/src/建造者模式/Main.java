package 建造者模式;

public class Main {

	public static void main(String[] args) {
		Director director=new Director();
		Builder builder=new Villa();
		//Builder builder=new Building();如果盖楼房则使用此
		director.builder(builder);
   Product product=builder.GetResult();
   product.show();
      
	}

}
