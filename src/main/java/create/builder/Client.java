package create.builder;

/**
 * 客户端
 * 需要知道指挥者，具体建造者
 * 优势为了方便，由客户端充当建造者，配置参数更加灵活
 */
public class Client {

    public static void main(String[] args) {

        // 此处把创造和表示部分隔离了
        Director director = new Director(new ConcreteExplosiveBuilder());
        Explosive construct = director.construct();

        // 使用内部Builder模式
        Explosive2 build = new Explosive2.Builder()
                .setSulphur(2)
                .setNitricAcid(3)
                .setCharcoal(7)
                .build();
    }
}
