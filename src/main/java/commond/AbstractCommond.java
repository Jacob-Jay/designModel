package commond;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-10-22 18:06
 */
public abstract class AbstractCommond implements Commond {
    private Receiver receiver;

    public AbstractCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }
}
