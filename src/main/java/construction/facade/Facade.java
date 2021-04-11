package construction.facade;

/**
 * 外观类
 * 就相当于封装了下方法的调用类
 */
public class Facade {

    private SubSystem1 sub1 = new SubSystem1();
    private SubSystem2 sub2 = new SubSystem2();

    public void doIt(){
        sub1.show();
        sub2.show();
    }
}
