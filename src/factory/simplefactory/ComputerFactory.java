package factory.simplefactory;

import factory.Computer;
import factory.MacbookComputer;
import factory.SurfaceBookComputer;

public class ComputerFactory {
    public Computer createComputer(String type) {
        Computer c = null;
        if (type.equals("Macbook")) {
            c = new MacbookComputer();
        } else if (type.equals("Surface")) {
            c = new SurfaceBookComputer();
        }
        return c;
    }
}
