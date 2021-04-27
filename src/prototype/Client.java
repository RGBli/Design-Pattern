package prototype;

public class Client {
    public Object clone(Prototype prototype) throws CloneNotSupportedException {
        return prototype.clone();
    }
}
