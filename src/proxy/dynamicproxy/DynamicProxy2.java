package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 通过实现 InvocationHandler 接口来实现动态代理，是最典型的一种用法
 */
public class DynamicProxy2 implements InvocationHandler {

    private Object subject;

    public DynamicProxy2(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before say hello...");
        Object ret = method.invoke(subject, args);
        System.out.println("After say hello...");
        return ret;
    }
}
