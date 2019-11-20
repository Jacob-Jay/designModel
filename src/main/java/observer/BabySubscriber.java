package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-20 16:40
 */
public class BabySubscriber implements Subscriber {

    public static void main(String[] args) {
        Subscriber subscriber = new BabySubscriber();
        Observer o1 = new Dad();
        Observer o2 = new Mom();
        subscriber.sub(o1);
        subscriber.sub(o2);
        ((BabySubscriber)subscriber).cry();
    }

    private List<Observer> observers = new ArrayList<Observer>();
    public void sub(Observer observer) {
        observers.add(observer);
    }

    public void unSub(Observer observer) {
        observers.remove(observer);
    }

    public void notice(Event event) {
        for (Observer observer : observers) {
            observer.observer(event);
        }
    }

    public void cry() {
        CreEvent creEvent = new CreEvent();
        notice(creEvent);

    }
}
