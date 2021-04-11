package create.builder;

/**
 * 产品类，炸药
 * 需要配置硫磺、硝酸、木炭，多个参数需要配置，为了防止漏掉参数，使用 builder来构造
 */
public class Explosive {

    private int sulphur; // 硫磺
    private int nitricAcid; // 硝酸
    private int charcoal; // 木炭

    // 只有本包和子类能配置，防止外部直接new
    protected Explosive() {
    }

    public void setSulphur(int sulphur) {
        this.sulphur = sulphur;
    }

    public void setNitricAcid(int nitricAcid) {
        this.nitricAcid = nitricAcid;
    }

    public void setCharcoal(int charcoal) {
        this.charcoal = charcoal;
    }

}
