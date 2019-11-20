package observer;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-20 16:38
 */
public interface Subscriber {
    void sub(Observer observer);

    void unSub(Observer observer);

    void notice(Event event);
}
