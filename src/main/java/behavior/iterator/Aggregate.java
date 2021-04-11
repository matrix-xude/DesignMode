package behavior.iterator;

/**
 * 抽象聚合类
 * 省略了add remove等方法，只为了展现迭代器设计模式
 */
public interface Aggregate<T> {

    Iterator<T> getIterator();
}
