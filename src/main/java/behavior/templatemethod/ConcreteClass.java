package behavior.templatemethod;

/**
 * 具体类
 */
public class ConcreteClass extends BaseClass{
    @Override
    protected boolean isAllShow() {
        return true;
    }

    @Override
    protected void youShow() {
        System.out.println("你秀了一段脱口秀");
    }

    @Override
    protected void myShow() {
        System.out.println("我秀出了风采");
    }
}
