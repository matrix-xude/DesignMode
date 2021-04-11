package construction.proxy;

/**
 * 客户端只知道代理类，不知道实际操作的类
 */
public class Client {

    public static void main(String[] args) {
        new Proxy().operate();
    }
}
