package 享元模式;

public class Piece implements Factory {
 private int position;     //棋子位置的序号
public Piece(int position) {
	this.position=position;
}
	@Override
	public void show(User user) {
		System.out.println("棋子位置"+position+",用户名"+user.getName());
	}

}
