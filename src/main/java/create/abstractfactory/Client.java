package create.abstractfactory;

/**
 * 访问者
 * 需要知道产品的抽象类和具体的工厂
 */
public class Client {

    public static void main(String[] args) {
        // 美国船厂开工了
        AmericanDockyard americanDockyard = new AmericanDockyard();
        AircraftCarrier aircraftCarrier = americanDockyard.createAircraftCarrier();
        Battleship battleship = americanDockyard.createBattleship();

        // 日本船厂开工了
        JapaneseDockyard japaneseDockyard = new JapaneseDockyard();
        AircraftCarrier aircraftCarrier2 = japaneseDockyard.createAircraftCarrier();
        Battleship battleship2 = japaneseDockyard.createBattleship();

        System.out.printf("美国船厂造了战列舰：%s 造了航母：%s%n", battleship.name(), aircraftCarrier.name());
        System.out.printf("日本船厂造了战列舰：%s 造了航母：%s%n", battleship2.name(), aircraftCarrier2.name());
    }
}
