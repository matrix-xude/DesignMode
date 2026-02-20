package construction.composite;

/**
 * 抽象构件，对外暴露
 */
public abstract class Component {

    void add(Component component){
        throw new RuntimeException("当前构件不能添加");
    }

    void remove(Component component){
        throw new RuntimeException("当前构件不能删除");
    }

    // 是否为叶子构件
    abstract boolean isLeaf();

    abstract void show();
}
