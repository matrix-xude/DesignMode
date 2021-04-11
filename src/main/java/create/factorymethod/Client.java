package create.factorymethod;

/**
 * 访问类
 * 只需要知道产品的抽象类即可，不需要知道具体产品
 * 还要需要知道具体工厂的名字
 */
public class Client {

    public static void main(String[] args) {
        // 一般工厂为单例，此处省略写法，直接创建
        Star star = new PlanetFactory().createStar();
        System.out.println(star.speed()+"km/s");
    }
}
