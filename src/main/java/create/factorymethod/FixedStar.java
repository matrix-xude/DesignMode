package create.factorymethod;

/**
 * 星球的实现类产品，恒星
 */
public class FixedStar implements Star{

    @Override
    public double speed() {
        return 0; // 恒星不移动
    }
}
