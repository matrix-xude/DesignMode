package create.abstractfactory;

/**
 * 日本产品战列舰
 */
public class JapaneseBattleship implements Battleship{
    @Override
    public String name() {
        return "大和号";
    }
}
