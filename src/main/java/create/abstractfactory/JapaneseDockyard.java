package create.abstractfactory;

/**
 * 具体工厂，日本造船厂，能生产日本的船,吴港造船厂
 */
public class JapaneseDockyard implements Dockyard{
    @Override
    public Battleship createBattleship() {
        return new JapaneseBattleship();
    }

    @Override
    public AircraftCarrier createAircraftCarrier() {
        return new JapaneseAircraftCarrier();
    }
}
