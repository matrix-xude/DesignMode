package behavior.momento;

/**
 * 发起人，需要保存状态的类
 */
public class Originator {

    /**
     * 需要保存的状态
     * 攻击力
     */
    private int attack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(attack);
    }

    // 恢复备忘录
    public void restoreMemento(Memento memento) {
        this.attack = memento.getAttack();
    }

}
