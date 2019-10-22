package commond;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-10-22 18:05
 */
public class SwimCommond extends   AbstractCommond {


    public SwimCommond(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        getReceiver().swim();
    }
}
