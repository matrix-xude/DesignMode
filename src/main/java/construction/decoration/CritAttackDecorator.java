package construction.decoration;

/**
 * 暴击装饰者
 */
public class CritAttackDecorator extends AttackDecorator {

    public CritAttackDecorator(Attack attack) {
        super(attack);
    }

    @Override
    public void attack() {
        super.attack();
        crit();
    }

    public void crit(){
        System.out.println("——暴击了");
    }
}
