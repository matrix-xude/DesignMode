package construction.facade;

/**
 * 客户端只需要知道外观类即可
 */
public class Client {

    public static void main(String[] args) {
        new Facade().doIt();
    }
}
