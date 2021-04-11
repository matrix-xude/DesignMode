package behavior.momento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setAttack(32);
        originator.setAttack(78);
        // 第一次保存攻击
        caretaker.add(originator.createMemento());
        originator.setAttack(113);
        // 第二次保存攻击
        caretaker.add(originator.createMemento());
        originator.setAttack(3);

        System.out.printf("当前攻击力是：%d\r\n", originator.getAttack());
        System.out.println("我不满意现在的攻击力，回档到上一次");
        // 回档操作
        originator.restoreMemento(caretaker.getMemento(1));
        System.out.printf("当前攻击力是：%d\r\n", originator.getAttack());
    }
}
