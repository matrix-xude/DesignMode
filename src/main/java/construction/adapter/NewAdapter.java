package construction.adapter;

/**
 * 适配器
 * 可以转换已有功能为目标接口形式
 */
public class NewAdapter implements NewTarget {

    private OldOperation operation;

    public NewAdapter() {
        this.operation = new OldOperation();
    }

    @Override
    public String getAge() {
        return operation.obtainAge() + "";
    }
}
