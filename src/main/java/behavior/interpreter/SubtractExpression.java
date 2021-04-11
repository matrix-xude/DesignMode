package behavior.interpreter;

/**
 * 非终端解释器
 * 减法解释器
 */
public class SubtractExpression extends LeftRightExpression {

    public SubtractExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
