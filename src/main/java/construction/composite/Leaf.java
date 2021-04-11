package construction.composite;

/**
 * 叶子构件
 * 内部没有抽象构件集合
 */
public class Leaf implements Component {

    @Override
    public void add(Component component) {
        throw new RuntimeException("叶子构件不能添加");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("叶子构件不能删除");
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public void show() {
        System.out.printf("我有%f万元钱！\r\n", Math.random() * 100);
    }
}
