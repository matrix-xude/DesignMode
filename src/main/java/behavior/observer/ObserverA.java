package behavior.observer;

public class ObserverA implements Observer{

    @Override
    public void response() {
        System.out.println("我是A,我看到了变化");
    }
}
