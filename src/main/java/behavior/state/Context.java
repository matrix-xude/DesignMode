package behavior.state;

/**
 * 环境类
 */
public class Context {

    // 默认未被选中
    private State state = new UnClickState(this);

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 提供给外部操作
    public void click(){
        state.click();
    }
}
