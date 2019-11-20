package observer;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-20 16:52
 */
public class Mom implements Observer {
    public void observer(Event e) {
        System.out.println("mom receive msg "+e.msg);
    }
}
