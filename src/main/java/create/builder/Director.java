package create.builder;

/***
 * 指挥者，给产品设置参数的地方
 * 这里指挥者不能灵活设置参数，如果交给客户端则比较灵活
 * 所以很多建造者模式没有指挥者，都是给了客户端自由的发挥，如 StringBuilder
 */
public class Director {

    private final ExplosiveBuilder builder;

    public Director(ExplosiveBuilder builder) {
        this.builder = builder;
    }

    /**
     * 指挥者创造炸药,顺序可以调整
     * @return
     */
    public Explosive construct(){
        builder.setCharcoal(); // 先放木炭
        builder.setNitricAcid(); // 再放硝酸
        builder.setSulphur(); // 最后放硫磺
        return builder.build();
    }
}
