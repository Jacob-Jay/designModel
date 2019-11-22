package proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-22 13:58
 */
public class Tank {
    public void move() {
        System.out.println("handler");
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

                proxy.invokeSuper(obj, args);
                System.out.println(obj.getClass().getName());
                System.out.println(method.getName());
                System.out.println(proxy.getSuperName());
               return null;

            }
        });
        Tank o = (Tank) enhancer.create();
        o.move();
    }
}
