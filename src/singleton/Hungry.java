package singleton;

/**
 * 饿汉单例模式
 * 声明 static 的成员变量 instance，并创建实例
 * 不会存在线程安全问题，因为在类加载时就创建了实例
 * 单例模式三步走
 * 1⃣️将所有的构造方法置为 private，避免其他类可以直接 new 对象
 * 2⃣️暴露 public 静态方法 getInstance()
 * 3⃣️单例逻辑
 */
public class Hungry {
    private static Hungry instance = new Hungry();

    private Hungry() {}

    public static Hungry getInstance() {
        return instance;
    }
}
