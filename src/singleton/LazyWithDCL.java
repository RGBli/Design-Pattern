package singleton;

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
