package behavior.iterator;

public class Client {

    public static void main(String[] args) {
        IntAggregate aggregate = new IntAggregate();
        Iterator<Integer> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}
