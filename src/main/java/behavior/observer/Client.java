package behavior.observer;

public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer o1 = new ObserverA();
        Observer o2 = new ObserverB();
        subject.add(o1);
        subject.add(o2);

        // 模拟发生变化回调
        subject.notifyAllObserver();
    }
}
