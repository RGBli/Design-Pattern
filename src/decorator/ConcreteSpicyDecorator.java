package decorator;

public class ConcreteSpicyDecorator extends Decorator {
    public ConcreteSpicyDecorator(Component component) {
        super(component);
    }

    // 定义自己的修饰逻辑
    private void decorateMethod() {
        System.out.println("加辣椒");
    }

    @Override
    public void make() {
        super.make();
        decorateMethod();
    }
}
