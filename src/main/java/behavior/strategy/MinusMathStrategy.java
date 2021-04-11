package behavior.strategy;

/**
 * 减法策略
 */
public class MinusMathStrategy implements MathStrategy {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
