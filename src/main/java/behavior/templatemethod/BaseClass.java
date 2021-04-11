package behavior.templatemethod;

/**
 * 抽象父类，控制流程
 */
public abstract class BaseClass {

    // 流程控制
    public void show() {
        myShow();
        youShow();
        if (isAllShow()) { // 钩子方法，反向控制
            System.out.println("大家一起秀起来！！");
        }
    }

    protected abstract boolean isAllShow();

    protected abstract void youShow();

    protected abstract void myShow();
}
