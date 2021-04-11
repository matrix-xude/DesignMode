package behavior.interpreter;

import java.util.Stack;

/**
 * 环境类
 * 用来生成解释器
 */
public class Context {

    private Expression expression;

    /**
     * 对字符串运算进行解析
     *
     * @param info 字符串运算
     * @return 计算记过
     */
    public int calculate(String info) {
        this.expression = createExpression(info);
        return expression.interpret();
    }

    /**
     * 生成解释器
     *
     * @param info “1+2-3” 类似这种
     * @return 解释器
     */
    private Expression createExpression(String info) {
        Stack<Expression> stack = new Stack<>();
        char[] chars = info.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char a = chars[i];
            switch (a) {
                case '+':
                    Expression left = stack.pop();
                    Expression right = new TerminalExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    Expression left2 = stack.pop();
                    Expression right2 = new TerminalExpression(String.valueOf(chars[++i]));
                    stack.push(new SubtractExpression(left2, right2));
                    break;
                case ' ':
                    break;
                default:
                    stack.push(new TerminalExpression(String.valueOf(a)));
                    break;
            }
        }
        return stack.pop();
    }

}
