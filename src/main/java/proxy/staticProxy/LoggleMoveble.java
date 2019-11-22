package proxy.staticProxy;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-21 17:28
 */
public class LoggleMoveble implements Moveble {
    private Moveble moveble;

    public LoggleMoveble(Moveble moveble) {
        this.moveble = moveble;
    }

    public void move() {
        System.out.println("start...........");
        moveble.move();
        System.out.println("end...........");

    }
}
