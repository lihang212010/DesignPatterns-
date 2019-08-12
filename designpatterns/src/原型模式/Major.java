package 原型模式;

public class Major extends Prototype{

	private String major;
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	@Override
	public Major clone() {
		return this.clone();
	}
	
}
