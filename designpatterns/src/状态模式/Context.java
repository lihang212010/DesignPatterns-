package 状态模式;

public class Context {
private int Hour;
private State state;
public Context() {
	state=new Morning();
}
public void setState(State state) {
	this.state = state;
}
public void show() {
	state.Next(this);
}
public void setHour(int hour) {
	Hour = hour;
}
public int getHour() {
	return Hour;
}

}
