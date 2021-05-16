package proxy.staticproxy;

import proxy.Subject;

public class StaticProxy implements Subject {

    private Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void sayHello() {
        System.out.println("before saying hello");
        subject.sayHello();
        System.out.println("after saying hello");
    }
}
