package stragegy;

public class Client {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategy1());
        context.contextInterface();

        context = new Context(new ConcreteStrategy2());
        context.contextInterface();
    }
}
