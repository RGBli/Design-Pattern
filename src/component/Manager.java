package component;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Component {
    private List<Component> components;

    public Manager(String position, String jobs) {
        super(position, jobs);
        components = new ArrayList<>();
    }

    @Override
    void addComponent(Component component) {
        components.add(component);
    }

    @Override
    void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    void check() {
        work();
        for (Component component : components) {
            component.check();
        }
    }
}
