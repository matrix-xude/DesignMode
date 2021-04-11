package construction.proxy;

/**
 * 具体实现功能的类
 * 不想暴露给客户端
 */
public class ConcreteOperation implements Operation{

    @Override
    public void operate() {
        System.out.println("我秀了一把");
    }
}
