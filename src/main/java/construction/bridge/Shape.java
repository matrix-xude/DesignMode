package construction.bridge;

/**
 * 抽象化角色，含有一个具体化维度
 * 形状
 */
public abstract class Shape {

    // 具体化的维度
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    // 获取具体形状
    abstract String getShape();

    public void show() {
        System.out.printf("我是一个%s的%s", color.getColor(), getShape());
    }
}
