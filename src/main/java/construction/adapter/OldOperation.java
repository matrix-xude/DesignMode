package construction.adapter;

/**
 * 之前已经实现了功能的类
 * 可以获取年龄，但是方法名，返回参数都不符合目标接口
 */
public class OldOperation {

    public int obtainAge(){
        return (int) (Math.random()*100);
    }
}
