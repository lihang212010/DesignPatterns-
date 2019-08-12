package 桥接模式;     

public abstract class System1 {   
protected Software software;   //设置软件
public void setSoftware(Software software) {
	this.software=software;
	}
public abstract void Run();
}
