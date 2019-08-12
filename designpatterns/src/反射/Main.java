package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

       Class cla=student.class;//获取clsaa对象
       Constructor c=cla.getConstructor(String.class,int.class);//反射返回构造函数
       student s=(student) c.newInstance("张三",18);//反射调用构造函数
       s.show();   //实验结果
       
       Method m=cla.getMethod("setName", String.class);//反射返回类中方法
       m.invoke(s, "王无"); //反射调用方法设置姓名值
       s.show();
       
       Method mm=cla.getMethod("show", null); //反射返回输出方法
       mm.invoke(s, null);    //输出
                        
	}

}
