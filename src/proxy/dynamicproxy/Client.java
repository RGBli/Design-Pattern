package proxy.dynamicproxy;

import proxy.Subject;
import proxy.SubjectImpl;

public class Client {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(subject);
        Subject proxyInstance = (Subject) dynamicProxy.getProxyInstance();
        proxyInstance.sayHello();
    }
}
