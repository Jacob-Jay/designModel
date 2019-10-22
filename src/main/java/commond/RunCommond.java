package commond;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-10-22 18:07
 */
public class RunCommond extends AbstractCommond {
    public RunCommond(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        getReceiver().run();
    }
}
