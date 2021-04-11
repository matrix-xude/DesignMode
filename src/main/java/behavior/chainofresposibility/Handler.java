package behavior.chainofresposibility;

/***
 * 抽象处理类
 * 含有下一个链结构的设置，获取，还有处理问题
 */
public abstract class Handler {

    private Handler handler;

    public void setNext(Handler handler) {
        this.handler = handler;
    }

    public Handler getNext() {
        return handler;
    }

    // 处理问题
    abstract void disposeRequest(int i);
}
