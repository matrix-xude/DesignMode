package behavior.mediator;

/**
 * 抽象中介者
 */
public interface Mediator {

    // 注册通信人
    void register(Person person);

    // 通信人需要通信时，应答
    void reply(Person person, String msg);
}
