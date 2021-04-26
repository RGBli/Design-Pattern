package singleton;

/**
 * 内部类实现单例模式
 * 在内部类中创建实例，getInstance() 中返回内部类创建的 instance
 * 简单并且不会存在线程安全问题
 */
public class SingletonWithInnerClass {
    private SingletonWithInnerClass() {}

    public static SingletonWithInnerClass getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static SingletonWithInnerClass instance = new SingletonWithInnerClass();
    }
}
