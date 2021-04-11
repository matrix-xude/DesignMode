package behavior.command;

/**
 * 具体命令
 * 打击
 */
public class HitCommand implements Command{

    private HitReceiver receiver = new HitReceiver();

    @Override
    public void execute() {
        // 具体执行交给执行人来做
        receiver.hitAction();
    }
}
