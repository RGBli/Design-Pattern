package builder.director;

public class Director {

    private Builder builder;

    // 指定建造者
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 建造方法
    public Product construct() {
        builder.setPartA();
        builder.setPartB();
        builder.setPartC();
        return builder.build();
    }
}
