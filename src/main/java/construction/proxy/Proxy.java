package construction.proxy;

public class Proxy implements Operation {

    private Operation operation;

    Proxy() {
        operation = new ConcreteOperation();
    }

    @Override
    public void operate() {
        System.out.println("想不到吧，我是代理类");
        operation.operate();
    }
}
