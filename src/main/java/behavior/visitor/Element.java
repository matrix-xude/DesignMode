package behavior.visitor;

/**
 * 需要被访问的元素都应该实现此接口
 */
public interface Element {

    // 接收一个访问者
    void accept(Visitor visitor);
}
