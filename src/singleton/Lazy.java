package singleton;

/**
 * 懒汉单例模式
 * 声明 static 的 instance，但不立即创建实例，而是等到调用 getInstance() 再创建实例
 * getInstance() 通过判断 instance 是否为 null 来决定是否创建实例
 * 会有线程安全问题
 */
public class Lazy {
    private static Lazy instance;

    private Lazy() {}

    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
