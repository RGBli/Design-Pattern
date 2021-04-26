package singleton;

/**
 * 双重校验的懒汉模式
 * 通过双重校验 + volatile + synchronized 来保证线程安全
 * 1⃣️为什么要第一个校验?
 * 因为 synchronized 代码块会有开销，避免多次进入该代码块
 * 2⃣️为什么要第二个校验?
 * 为了判断 instance 是否为 null，保证单例
 * 3⃣️为什么要 synchronized?
 * 保证统一时刻只有一个线程可以进入该代码块来创建 instance
 * 4⃣️为什么要 volatile?
 * 可能有多个线程通过了第一次校验，使用 volatile 保证 instance 对进入 synchronized 代码块的线程可见
 */
public class LazyWithDCL {
    private static volatile LazyWithDCL instance;

    private LazyWithDCL() {}

    public static LazyWithDCL getInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                if (instance == null) {
                    instance = new LazyWithDCL();
                }
            }
        }
        return instance;
    }
}
