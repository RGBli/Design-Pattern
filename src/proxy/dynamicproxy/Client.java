package proxy.dynamicproxy;

import proxy.Subject;
import proxy.SubjectImpl;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        dynamicProxy1(subject);
        dynamicProxy2(subject);
    }

    public static void dynamicProxy1(Subject subject) {
        DynamicProxy1 dynamicProxy = new DynamicProxy1(subject);
        // 通过调用代理类的 getProxyInstance() 方法获取代理对象
        Subject proxyInstance = (Subject) dynamicProxy.getProxyInstance();
        proxyInstance.sayHello();
    }

    public static void dynamicProxy2(Subject subject) {
        Subject dynamicProxy = (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                new DynamicProxy2(new SubjectImpl()));
        dynamicProxy.sayHello();
    }
}
