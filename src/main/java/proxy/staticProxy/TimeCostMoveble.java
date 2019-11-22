package proxy.staticProxy;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-21 17:31
 */
public class TimeCostMoveble implements Moveble {

    private Moveble moveble;

    public TimeCostMoveble(Moveble moveble) {
        this.moveble = moveble;
    }

    public void move() {
        long l = System.currentTimeMillis();

        moveble.move();
        long l2 = System.currentTimeMillis();
        long l1 = l2 - l;
        System.out.println("cost "+l1);
    }
}
