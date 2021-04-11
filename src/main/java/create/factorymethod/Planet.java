package create.factorymethod;

/**
 * 星球实现类产品，行星
 */
public class Planet implements Star{

    @Override
    public double speed() {
        return 20.1;  // km/s
    }
}
