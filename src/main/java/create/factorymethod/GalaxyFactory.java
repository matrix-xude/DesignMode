package create.factorymethod;

/**
 * 抽象工厂接口，银河系
 */
public interface GalaxyFactory {

    // 银河系可以生产星球，返回值为star，应该是“关联”，不是“依赖”
    Star createStar();
}
