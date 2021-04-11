package construction.decoration;

/**
 * 具体攻击方式
 * 用枪械攻击
 */
public class GunAttack implements Attack{
    @Override
    public void attack() {
        System.out.println("用枪械攻击");
    }
}
