package proxy.staticProxy;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-21 17:25
 */
public class Tank implements Moveble {
    public static void main(String[] args) {
        Moveble moveble = new LoggleMoveble(new TimeCostMoveble(new Tank()));
        moveble.move();
    }

    public void move() {
        System.out.println("move");
        try {
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
