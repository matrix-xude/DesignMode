package create.prototype;

public class Client {

    public static void main(String[] args) {
        PrototypeImpl prototype = new PrototypeImpl();
        PrototypeImpl prototype2 = null;
        try {
            prototype2 = prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(prototype.mList);
        // 修改了数字，如果不使用深拷贝，clone后的prototype2也会修改
        prototype.mList.set(0, 4);
        System.out.println(prototype2 == null ? "拷贝失败了" : prototype2.mList);
    }
}
