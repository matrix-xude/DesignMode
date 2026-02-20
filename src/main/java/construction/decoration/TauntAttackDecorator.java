package construction.decoration;

/**
 * 具体装饰类
 * 嘲讽攻击
 */
public class TauntAttackDecorator extends AttackDecorator {

    public TauntAttackDecorator(Attack attack) {
        super(attack);
    }

    /**
     * 我的攻击自带嘲讽
     */
    public void taunt(){
        System.out.print("嘲讽对手，");
    }

    @Override
    public void attack() {
        taunt(); // 先嘲讽
        super.attack();
    }
}
