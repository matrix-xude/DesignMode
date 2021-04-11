package create.builder;

/**
 * 具体的炸药配置者，这里就把类的创建和表示分开了
 * 参数都在这里配置，表示部分在此，
 * 配置部分不在此，由指挥者操作,当然很多时候把指挥者交给了客户，更加灵活
 */
public class ConcreteExplosiveBuilder extends ExplosiveBuilder {

    @Override
    public void setSulphur() {
        explosive.setSulphur(1);
    }

    @Override
    public void setNitricAcid() {
        explosive.setNitricAcid(2);
    }

    @Override
    public void setCharcoal() {
        explosive.setCharcoal(3);
    }
}
