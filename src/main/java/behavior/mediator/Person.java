package behavior.mediator;

/**
 * 抽象通信人
 */
public abstract class Person {

    // 需要持有一个中介者的引用
    protected Mediator mediator;
    public String name;

    public Person() {
        this.name = getName();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract String getName();

    public abstract void sendMsg(String msg);

    public abstract void receiveMsg(String name, String msg);
}
