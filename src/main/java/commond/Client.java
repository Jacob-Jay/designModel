package commond;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-10-22 17:56
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        invoker.addCommond(new RunCommond(receiver));
        invoker.addCommond(new SwimCommond(receiver));
        invoker.addCommond(new RunCommond(receiver));
        invoker.addCommond(new SwimCommond(receiver));
        invoker.invoke();
    }
}
