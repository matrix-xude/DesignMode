package behavior.command;

/**
 * 具体命令
 * 间谍刺探
 */
public class SpyCommand implements Command{

    private SpyReceiver receiver = new SpyReceiver();

    @Override
    public void execute() {
        // 具体执行交给执行人来做
        receiver.spyAction();
    }
}
