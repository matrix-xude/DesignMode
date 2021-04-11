package behavior.interpreter;

/**
 * 非终端解释器
 * 含有左右2个解释器的
 */
public abstract class LeftRightExpression implements Expression{

    protected Expression left;
    protected Expression right;

    // 必须由左右2个解释器构件
    public LeftRightExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
