package 命令模式;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
private List<Icommand> list=new ArrayList<Icommand>();  //订单不只有一个
public void setList(Icommand icommand) {
	list.add(icommand);
}
public void Notify() {
	for (Icommand icommand : list) {
		icommand.Excute();
	}
}
}
