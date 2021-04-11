package create.singleton;

/**
 * 饿汉式
 * 一上来就是加载到内存中，简单安全，但是内存占用较大
 */
public class SingletonA {

    // 一上来直接创建
    private static final SingletonA mInstance = new SingletonA();

    // 私有化构造函数
    private SingletonA() {
    }

    public static SingletonA getInstance() {
        return mInstance;
    }
}
