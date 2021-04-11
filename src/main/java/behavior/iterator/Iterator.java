package behavior.iterator;

/**
 * 抽象迭代器
 */
public interface Iterator<T> {

    // 获取下一个元素
    T getNext();

    // 是否有下一个元素
    boolean hasNext();

}
