package construction.decoration;

/**
 * 具体攻击方式
 * 用剑攻击
 */
public class SwordAttack implements Attack{
    @Override
    public void attack() {
        System.out.println("用剑攻击");
    }
}
