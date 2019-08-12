package 建造者模式;

import java.util.ArrayList;
import java.util.List;



public class Product {
List <String>  list=new ArrayList<String>();
public void Add(String part) {
	list.add(part);
}
public void show() {
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
}
}
