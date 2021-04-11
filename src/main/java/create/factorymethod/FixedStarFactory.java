package create.factorymethod;

/**
 * 具体工厂，恒星工厂，专门生产恒星
 */
public class FixedStarFactory implements GalaxyFactory{
    @Override
    public FixedStar createStar() {
        return new FixedStar();
    }
}
