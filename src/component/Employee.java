package component;

public class Employee extends Component {
    public Employee(String position, String jobs) {
        super(position, jobs);
    }

    @Override
    void addComponent(Component component) {
        System.out.println("Forbidden");
    }

    @Override
    void removeComponent(Component component) {
        System.out.println("Forbidden");
    }

    @Override
    void check() {
        work();
    }
}
