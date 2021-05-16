package proxy.dynamicproxy;

import proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    private Subject subject;

    public DynamicProxy(Subject subject) {
        this.subject = subject;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Before say hello...");
                Object ret = method.invoke(subject, args);
                System.out.println("After say hello...");
                return ret;
            }
        });
    }
}
