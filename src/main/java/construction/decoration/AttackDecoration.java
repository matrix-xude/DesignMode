package construction.decoration;

/**
 * 装饰抽象类
 * 所有需要装饰的类都继承此类
 */
public abstract class AttackDecoration implements Attack {

    private Attack attack;

    // 自己选择需要装饰的类，与代理模式的差异在此
    public AttackDecoration(Attack attack) {
        this.attack = attack;
    }

    @Override
    public void attack() {
        attack.attack();
    }
}
