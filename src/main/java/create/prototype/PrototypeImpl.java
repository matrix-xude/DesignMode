package create.prototype;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 具体原型类
 */
public class PrototypeImpl implements IPrototype {

    public List<Integer> mList = Stream.of(1,2,3,4).collect(Collectors.toList());

    // 可见性改为public，方便外面调用
    @Override
    public PrototypeImpl clone() throws CloneNotSupportedException {
        PrototypeImpl clone = (PrototypeImpl) super.clone();
        // 实现了mList的深拷贝
        clone.mList = List.copyOf(mList);
        return clone;
    }
}
