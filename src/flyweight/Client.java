package flyweight;

public class Client {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight fa1 = factory.getFlyWeight("a");
        FlyWeight fa2 = factory.getFlyWeight("a");
        FlyWeight fa3 = factory.getFlyWeight("a");
        FlyWeight fb1 = factory.getFlyWeight("b");
        FlyWeight fb2 = factory.getFlyWeight("b");
        fa1.operation(new UnsharedConcreteFlyWeight("第1次调用a"));
        fa2.operation(new UnsharedConcreteFlyWeight("第2次调用a"));
        fa3.operation(new UnsharedConcreteFlyWeight("第3次调用a"));
        fb1.operation(new UnsharedConcreteFlyWeight("第1次调用b"));
        fb2.operation(new UnsharedConcreteFlyWeight("第2次调用b"));
    }
}
