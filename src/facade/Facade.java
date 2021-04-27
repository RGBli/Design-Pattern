package facade;

public class Facade {
    private SubSystem1 obj1 = new SubSystem1();
    private SubSystem2 obj2 = new SubSystem2();

    public void method() {
        obj1.method();
        obj2.method();
    }
}
