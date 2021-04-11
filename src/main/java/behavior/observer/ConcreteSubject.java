package behavior.observer;

/**
 * 具体被观察
 */
public class ConcreteSubject extends Subject{

    @Override
    public void notifyAllObserver() {
        list.forEach(Observer::response);
    }
}
