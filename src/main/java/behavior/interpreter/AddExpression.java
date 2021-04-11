package behavior.interpreter;

/**
 * 非终端解释器
 * 加法解释器
 */
public class AddExpression extends LeftRightExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
