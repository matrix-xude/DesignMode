package construction.composite;

/**
 * 客户端只需要知道抽象构件即可
 */
public class Client {

    public static void main(String[] args) {
        Component component = constructComponent();
        component.show();
    }

    /**
     * 构造一个抽象构件
     * @return 抽象构件
     */
    public static Component constructComponent(){
        Composite c = new Composite();

        Composite c1 = new Composite();
        Composite c2 = new Composite();
        Leaf l1 = new Leaf();
        c.add(c1);
        c.add(c2);
        c.add(l1);

        Leaf l2 = new Leaf();
        Leaf l3 = new Leaf();
        c1.add(l2);
        c1.add(l3);

        Leaf l4 = new Leaf();
        c2.add(l4);

        return c;
    }
}
