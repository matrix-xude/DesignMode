package behavior.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        XiaoMing p1 = new XiaoMing();
        Jack p2 = new Jack();
        // 互相持有引用
        p1.setMediator(mediator);
        p2.setMediator(mediator);
        mediator.register(p1);
        mediator.register(p2);

        p1.sendMsg("你好啊");
        p2.sendMsg("Hello");
        p1.sendMsg("Can you speak Chinese?");
        p2.sendMsg("Just a little, i try!");
        p2.sendMsg("我有一只小凶许");
        p1.sendMsg("Oh , let me speak English!");
    }
}
