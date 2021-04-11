package behavior.observer;

public class ObserverB implements Observer{

    @Override
    public void response() {
        System.out.println("我是B,我也看到了");
    }
}
