package create.singleton;

/**
 * 利用静态内部类来实现单例
 * 原理：static类的加载时机为第一次使用，保证了节省内存
 * 并且只能由系统加载，保证了单一线程
 */
public class SingletonC {

    private SingletonC() {
    }

    // static内部类的加载时机为第一次调用的时候，并且只能由系统线程加载
    static class SingletonHolder {
        private static final SingletonC INSTANCE = new SingletonC();
    }

    public static SingletonC getInstance() {
        // 由系统线程保证加载的线程安全性
        return SingletonHolder.INSTANCE;
    }
}
