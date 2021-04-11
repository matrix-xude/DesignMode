package behavior.momento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理备忘录状态
 * 职责分离，与需要保存状态的分开
 */
public class Caretaker {

    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento){
        list.add(memento);
    }

    public void remove(Memento memento){
        list.remove(memento);
    }

    public Memento getMemento(int index){
        return list.get(index);
    }

}
