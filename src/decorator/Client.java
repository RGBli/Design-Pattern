package decorator;

public class Client {
    public static void main(String[] args){
        /*Component component = new ConcreteComponent();
        component.make();
        // 第一次装饰
        component = new ConcreteEggDecorator(component);
        component.make();
        // 第二次装饰
        component = new ConcreteSpicyDecorator(component);
        component.make();*/
        Component component = new ConcreteSpicyDecorator(new ConcreteEggDecorator(new ConcreteComponent()));
        component.make();
    }
}
