package decorator;

public class ConcreteEggDecorator extends Decorator {
    public ConcreteEggDecorator(Component component) {
        super(component);
    }

    // 定义自己的修饰逻辑
    private void decorateMethod() {
        System.out.println("加个蛋");
    }

    @Override
    public void make() {
        super.make();
        decorateMethod();
    }
}
