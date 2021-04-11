package construction.flyweight;

/**
 * 只知道围棋工厂即可
 */
public class Client {

    public static void main(String[] args) {
        Go go1 = GoFactory.getGo("白色");
        Go go2 = GoFactory.getGo("黑色");
        Go go3 = GoFactory.getGo("白色");
        Go go4 = GoFactory.getGo("黑色");
        Go go5 = GoFactory.getGo("白色");
        Go go6 = GoFactory.getGo("黑色");

        go1.dropDown(3,4);
        go2.dropDown(11,5);
        go3.dropDown(1,16);
        go4.dropDown(5,8);
        go5.dropDown(9,10);
        go6.dropDown(12,17);
    }
}
