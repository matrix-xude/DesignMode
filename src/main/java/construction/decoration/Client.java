package construction.decoration;

import java.util.Comparator;

/**
 * 客户端需要知道具体的攻击方式，和需要装饰的类
 */
public class Client {

    public static void main(String[] args) {
        // 具体攻击方式还是具体的攻击类实现，可以自由选择
//        MyAttack myAttack = new MyAttack(new GunAttack());
        MyAttack myAttack = new MyAttack(new SwordAttack());
        myAttack.taunt();
        myAttack.attack();
    }
}