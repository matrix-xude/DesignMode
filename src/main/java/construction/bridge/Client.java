package construction.bridge;

/**
 * 客户端需要知道 2个维度的内容
 * Shape 和 Color
 */
public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Red());
        triangle.show();
    }
}
