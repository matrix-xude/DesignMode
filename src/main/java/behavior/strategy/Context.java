package behavior.strategy;

/**
 * 环境类
 */
public class Context {

    private MathStrategy strategy;

    public void setStrategy(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public void useStrategy() {
        int result = strategy.calculate(3, 2);
        System.out.println("我的策略结果是：" + result);
    }
}
