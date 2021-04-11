package behavior.state;

/**
 * 已经被选中的状态
 */
public class ClickedState extends State{

    public ClickedState(Context context) {
        super(context);
    }

    @Override
    public void click() {
        System.out.println("当前状态是选中的，又被点击了一下，将取消选中");
        context.setState(new UnClickState(context));
    }
}
