package create.abstractfactory;

/**
 * 抽象工厂，造船厂
 * 都能造战列舰、航母，它们不是同一等级的产品，但是是同一族产品
 */
public interface Dockyard {

    // 造战列舰
    Battleship createBattleship();

    // 造航母
    AircraftCarrier createAircraftCarrier();
}
