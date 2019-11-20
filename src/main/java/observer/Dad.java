package observer;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-20 16:46
 */
public class Dad implements Observer {
    public void observer(Event e) {
        System.out.println("dad get messagse"+e.getMsg());
    }
}
