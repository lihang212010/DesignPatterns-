package 享元模式;

import java.util.Hashtable;

public class PieceFactory {
private Hashtable<Integer,Factory> position=new Hashtable<>();
public Factory getPiece(int key) {
	if(!position.contains(key)) {
		position.put(key, new Piece(key));
	}
return (Factory)position.get(key);
}
public void getSize() {
	System.out.println("总共使用"+position.size()+"种棋子位置");
}
}
