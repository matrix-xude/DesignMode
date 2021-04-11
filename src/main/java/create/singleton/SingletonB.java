package create.singleton;

/**
 * 懒汉式
 * 在使用的时候才初始化，节省内存
 * 注意事项比较多
 */
public class SingletonB {

    // 必须加上 volatile 保证可见性，防止重排序
    private static volatile SingletonB mInstance;

    private SingletonB() {
    }

    // 不在方法上加锁是为了提高多线程使用此方式的效率，防止抢锁
    public static SingletonB getInstance() {
        if (mInstance == null) {  // 第一重判null是为了提高效率，当不为null的时候，不需要抢锁
            synchronized (SingletonB.class) {
                if (mInstance == null)  // 双重判null，因为第一重判null可能多线程已经进入
                    mInstance = new SingletonB();
            }
        }
        return mInstance;
    }
}
