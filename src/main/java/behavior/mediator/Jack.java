package behavior.mediator;

/**
 * Jack，通信人之一
 */
public class Jack extends Person {

    @Override
    public String getName() {
        return "Jack";
    }

    @Override
    public void sendMsg(String msg) {
        System.out.printf("%s发出了信息：%s\r\n", this.name, msg);
        mediator.reply(this,msg);
    }

    @Override
    public void receiveMsg(String name, String msg) {
        System.out.printf("收到了%s的信息：%s\r\n", name, msg);
    }
}
