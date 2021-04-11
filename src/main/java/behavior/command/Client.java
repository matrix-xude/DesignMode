package behavior.command;

/**
 * 客户端只与调用者和命令关联，不与具体执行者关联
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.addCommand(new SpyCommand());
        invoker.addCommand(new HitCommand());
        invoker.execute();
    }
}
