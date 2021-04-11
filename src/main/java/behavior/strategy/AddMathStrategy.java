package behavior.strategy;

/**
 * 加法策略
 */
public class AddMathStrategy implements MathStrategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
