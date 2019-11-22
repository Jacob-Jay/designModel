package proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-22 13:37
 */
public class HelloImpl implements  Hello {
    public void sayHello(String name) {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Hello o1 = (Hello) Proxy.newProxyInstance(HelloImpl.class.getClassLoader(),
                new Class[]{Hello.class},
                new InvocationHandler(new HelloImpl()));
        Hello o = (Hello) Proxy.newProxyInstance(HelloImpl.class.getClassLoader(),
                new Class[]{Hello.class},
                new InvocationHandler2(o1));
        o.sayHello("jq");
    }
}
