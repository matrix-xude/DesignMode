package construction.decoration;

/**
 * 客户端需要知道具体的攻击方式，和需要装饰的类
 */
public class Client {

    public static void main(String[] args) {
        // 具体攻击方式还是具体的攻击类实现，可以自由选择
        Attack attack1 = new TauntAttackDecorator(new SwordAttack());
        attack1.attack();

        // 多重装饰
        Attack attack2 = new CritAttackDecorator(new TauntAttackDecorator(new GunAttack()));
        attack2.attack();

    }
}