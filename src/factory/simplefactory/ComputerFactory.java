package factory.simplefactory;

import factory.Computer;
import factory.MacbookComputer;
import factory.SurfaceBookComputer;

public class ComputerFactory {
    public Computer createComputer(String type) {
        Computer c = null;
        if (type.equals("macbook")) {
            c = new MacbookComputer();
        } else if (type.equals("surface")) {
            c = new SurfaceBookComputer();
        }
        return c;
    }
}
