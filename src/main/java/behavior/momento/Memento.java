package behavior.momento;

/**
 * 备忘录，保存了状态
 * 客户端不需要知道此备忘录保存了什么类型
 */
public class Memento {

    // 与需要保存的状态对应
    private int attack;

    public Memento(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
