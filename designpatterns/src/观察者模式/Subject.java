package 观察者模式;

public interface Subject {
void Add(Observer observer);
void Reduce(Observer observer);
String getName();
void serName(String string);
void Notify();
}
