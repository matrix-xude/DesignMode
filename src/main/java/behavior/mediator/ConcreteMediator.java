package behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 */
public class ConcreteMediator implements Mediator {

    private final List<Person> list = new ArrayList<>();

    @Override
    public void register(Person person) {
        list.add(person);
    }

    @Override
    public void reply(Person person, String msg) {
        // 除了自己，其它注册通信人都能收到信息
        list.forEach(p -> {
            if (p != person) {
                p.receiveMsg(person.name, msg);
            }
        });
    }
}
