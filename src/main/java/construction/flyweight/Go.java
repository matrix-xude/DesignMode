package construction.flyweight;

/**
 * 享元角色
 * 围棋
 */
public interface Go {

    /**
     * 围棋落子的地点
     * @param x 1-19
     * @param y 1- 19
     */
    void dropDown(int x, int y);
}
