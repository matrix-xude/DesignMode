package behavior.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        MathStrategy strategy = new MinusMathStrategy();
        context.setStrategy(strategy);

        context.useStrategy();
    }
}
