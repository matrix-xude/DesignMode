package behavior.chainofresposibility;

/**
 * 中等数字的具体处理器
 */
public class MiddleHandler extends Handler {
    @Override
    void disposeRequest(int i) {
        if (10 <= i && i < 100) {
            System.out.printf("%s处理了数字%d", this.getClass().getSimpleName(), i);
        } else {
            // 流转给链上的下一个处理器，直到没有下一个链
            if (getNext() != null) {
                getNext().disposeRequest(i);
            } else {
                System.out.println("该链上无法处理此请求");
            }
        }
    }
}
