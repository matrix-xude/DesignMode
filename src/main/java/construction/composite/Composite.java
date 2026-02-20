package construction.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件，内部包含抽象构件
 */
public class Composite extends Component {

    private List<Component> childList = new ArrayList<>();

    @Override
    public void add(Component component) {
        childList.add(component);
    }

    @Override
    public void remove(Component component) {
        childList.remove(component);
    }

    @Override
    public boolean isLeaf() { // 不是叶子构件
        return false;
    }

    @Override
    public void show() {
        // 展示自己
        System.out.println(this.getClass().getSimpleName());
        // 展示子构件
        for (Component c : childList) {
            c.show();
        }
    }
}
