package create.abstractfactory;

/**
 * 具体工厂，美国造船厂，能生产美国的船
 */
public class AmericanDockyard implements Dockyard{
    @Override
    public Battleship createBattleship() {
        return new AmericanBattleship();
    }

    @Override
    public AircraftCarrier createAircraftCarrier() {
        return new AmericanAircraftCarrier();
    }
}
