package construction.adapter;

/**
 * 客户端只需要知道目标接口 and 适配器
 */
public class Client {

    public static void main(String[] args) {
        String age = new NewAdapter().getAge();
        System.out.printf("我的年纪是%s%n",age);
    }
}
