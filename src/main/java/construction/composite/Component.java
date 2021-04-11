package construction.composite;

/**
 * 抽象构件，对外暴露
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    // 是否为叶子构件
    boolean isLeaf();

    void show();
}
