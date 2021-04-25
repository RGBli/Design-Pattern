package singleton;

public class SingletonWithInnerClass {
    private SingletonWithInnerClass() {}

    public static SingletonWithInnerClass getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static SingletonWithInnerClass instance = new SingletonWithInnerClass();
    }
}
