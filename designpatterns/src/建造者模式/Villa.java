package 建造者模式;

public class Villa implements Builder{
  Product product=new Product();
	@Override
	public void build1() {
		product.Add("地基");
		
	}

	@Override
	public void build2() {
		product.Add("框架");
		
	}

	@Override
	public void build3() {
		product.Add("装修");
	}

	@Override
	public Product GetResult() {
		return product;
		
	}

}
