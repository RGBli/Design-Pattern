package stragegy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 上下文接口
    public void contextInterface() {
        strategy.algorithm();
    }
}