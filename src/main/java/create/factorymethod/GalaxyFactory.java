package create.factorymethod;

/**
 * 抽象工厂接口，银河系
 */
public interface GalaxyFactory {

    // 银河系可以生产星球
    Star createStar();
}
