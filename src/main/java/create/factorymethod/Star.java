package create.factorymethod;

/**
 * 生产的产品接口
 * 高层结构只需要知道此接口产品即可，不需要知道具体的产品
 */
public interface Star {

    // 移动的速度
    double speed();
}
