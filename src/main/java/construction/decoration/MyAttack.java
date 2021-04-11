package construction.decoration;

/**
 * 具体装饰类
 * 我的攻击方式
 */
public class MyAttack extends AttackDecoration{

    public MyAttack(Attack attack) {
        super(attack);
    }

    /**
     * 我的攻击自带嘲讽
     */
    public void taunt(){
        System.out.println("嘲讽对手");
    }
}
