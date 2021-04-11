package construction.flyweight;

/**
 * 具体的围棋
 * key表示颜色
 */
public class ConcreteGo implements Go {

    private final String key;

    public ConcreteGo(String key) {
        this.key = key;
        System.out.printf("%s棋子第一被创建\r\n", this.key);
    }

    @Override
    public void dropDown(int x, int y) {
        System.out.printf("%s棋子落在了%d-%d的位置\r\n", key, x, y);
    }
}
