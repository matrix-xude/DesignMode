package create.builder;

/**
 * 建造炸药的抽象类
 * 设置需要配置的参数
 */
public abstract class ExplosiveBuilder {

    // 炸药生命周期绑定到建造者，这里是"组合"关系
    protected Explosive explosive;

    public ExplosiveBuilder() {
        explosive = new Explosive();
    }

    // 设置硫磺
    abstract void setSulphur();

    // 设置硝酸
    abstract void setNitricAcid();

    // 设置木炭
    abstract void setCharcoal();

    // 获取炸药产品
    Explosive build() {
        return explosive;
    }
}
