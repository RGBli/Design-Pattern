package iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj.toString() + "\t");
        }
        Object obj = it.first();
        System.out.println("\nFirst：" + obj.toString());
    }
}
