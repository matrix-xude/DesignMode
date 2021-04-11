package behavior.interpreter;

/**
 * 最终解释器
 * 用来把字符串转为数字
 */
public class TerminalExpression implements Expression{

    private String info;

    public TerminalExpression(String info) {
        this.info = info;
    }

    @Override
    public int interpret() {
        return Integer.parseInt(info);
    }
}
