package behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 包含元素得容器
 * 包含了学生元素、老师元素
 */
public class School {

    private List<Element> list = new ArrayList<>();

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }

    /**
     * 容器接收一个访问者，提供访问者的操作
     * @param visitor 访问者，有自己的访问逻辑
     */
    public void visit(Visitor visitor) {
        list.forEach(element -> element.accept(visitor));
    }

}
