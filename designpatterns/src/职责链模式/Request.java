package 职责链模式;

public class Request {         //请求
private String request;
public Request(String request) {
	this.request=request;
}
public String getRequest() {
	return request;
}
public void show() {
	System.out.println("提出"+request+":");
}
}
