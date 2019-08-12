package 享元模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PieceFactory p=new PieceFactory();//建立棋子工厂
    
    Factory p1=p.getPiece(10);  //建立几个不同和相同的棋子位置
    p1.show(new User("小王"));
    
    Factory p2=p.getPiece(23);
    p2.show(new User("小李"));
    Factory p3=p.getPiece(23);
    p2.show(new User("小马"));
    
    p.getSize();
    
	}

}
