package proxy.dynamic.jdk;

import java.lang.reflect.Method;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-22 13:37
 */
public class InvocationHandler2 implements java.lang.reflect.InvocationHandler {
    private Object target;

    public InvocationHandler2(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("time start ,,,,,,,,,,,,,");
        Object invoke = method.invoke(target, args);
        System.out.println("time end... ,,,,,,,,,,,,,");
        return invoke;
    }
}
