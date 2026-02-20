package create.factorymethod;

/**
 * 访问类
 * 只需要知道产品的抽象类即可，不需要知道具体产品
 * 还要需要知道具体工厂的名字
 */
public class Client {

    public static void main(String[] args) {
        // 这里必须用GalaxyFactory，才能体现工厂方法的依赖倒置
        GalaxyFactory factory = new PlanetFactory();
        Star star = factory.createStar();
        System.out.println(star.speed()+"km/s");
    }
}
