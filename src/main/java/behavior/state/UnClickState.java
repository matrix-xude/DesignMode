package behavior.state;

/**
 * 未被选中的状态
 */
public class UnClickState extends State{

    public UnClickState(Context context) {
        super(context);
    }

    @Override
    public void click() {
        System.out.println("当前状态未被选中，又被点击了一下，将被选中");
        context.setState(new ClickedState(context));
    }
}
