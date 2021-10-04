package iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("lbw");
        ag.add("sg");
        ag.add("jp");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj.toString() + "\t");
        }
        Object obj = it.first();
        System.out.println("\nFirst：" + obj.toString());
    }
}
