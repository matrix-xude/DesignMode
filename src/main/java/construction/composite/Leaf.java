package construction.composite;

/**
 * 叶子构件
 * 内部没有抽象构件集合
 */
public class Leaf extends Component {

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public void show() {
        System.out.printf("我有%f万元钱！\r\n", Math.random() * 100);
    }
}
