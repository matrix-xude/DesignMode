package behavior.state;

/**
 * 抽象状态
 */
public abstract class State {

    protected Context context;

    public State(Context context) {
        this.context = context;
    }

    // 点击按钮选择 or 取消选择
    public abstract void click();
}
