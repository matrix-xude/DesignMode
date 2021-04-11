package construction.bridge;

/**
 * 形状的一个具体实例，三角形
 */
public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    @Override
    String getShape() {
        return "三角形";
    }
}
