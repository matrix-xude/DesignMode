package create.factorymethod;

/**
 * 具体工厂，行星工厂，专门生产行星
 */
public class PlanetFactory implements GalaxyFactory {

    @Override
    public Planet createStar() {
        return new Planet();
    }
}
