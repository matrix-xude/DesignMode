package behavior.chainofresposibility;

public class Client {

    public static void main(String[] args) {
        // 链接先交给 MiddleHandler，再交给 SmallIntHandler
        MiddleHandler middleHandler = new MiddleHandler();
        SmallIntHandler smallIntHandler = new SmallIntHandler();
        middleHandler.setNext(smallIntHandler);

        middleHandler.disposeRequest(1);
    }
}
