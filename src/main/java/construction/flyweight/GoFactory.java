package construction.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 围棋工厂
 */
public class GoFactory {

    // 存储key对应的棋子
    private static final Map<String, Go> map = new HashMap<>();

    // 同一个key获取的对象保持相同
    public static Go getGo(String key) {
        Go go = map.get(key);
        if (go == null) {
            go = new ConcreteGo(key);
            map.put(key, go);
        }
        return go;
    }
}
