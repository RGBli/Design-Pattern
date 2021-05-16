package proxy.staticproxy;

import proxy.Subject;
import proxy.SubjectImpl;

public class Client {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        StaticProxy staticProxy = new StaticProxy(subject);
        staticProxy.sayHello();
    }
}
