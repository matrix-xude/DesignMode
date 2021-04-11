package behavior.templatemethod;

public class Client {

    public static void main(String[] args) {
        BaseClass base = new ConcreteClass();
        base.show();
    }
}
