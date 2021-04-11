package create.builder;

/**
 * 产品类，炸药
 * 需要配置硫磺、硝酸、木炭，多个参数需要配置，内部Builder构造模式
 */
public class Explosive2 {

    private int sulphur; // 硫磺
    private int nitricAcid; // 硝酸
    private int charcoal; // 木炭

    // 只有本包和子类能配置，防止外部直接new
    protected Explosive2(Builder builder) {
        this.sulphur = builder.sulphur;
        this.nitricAcid = builder.nitricAcid;
        this.charcoal = builder.charcoal;
    }

    /**
     * 内部Builder好处多多
     * 1. 分离了构造函数
     * 2. 配置灵活
     * 3. 创造产品时刻比较晚
     * 4. 配置好生产的产品就不能再修改参数
     */
    public static class Builder {
        private int sulphur; // 硫磺
        private int nitricAcid; // 硝酸
        private int charcoal; // 木炭

        public Builder setSulphur(int sulphur) {
            this.sulphur = sulphur;
            return this;
        }

        public Builder setNitricAcid(int nitricAcid) {
            this.nitricAcid = nitricAcid;
            return this;
        }

        public Builder setCharcoal(int charcoal) {
            this.charcoal = charcoal;
            return this;
        }

        public Explosive2 build(){
            return new Explosive2(this);
        }
    }
}
