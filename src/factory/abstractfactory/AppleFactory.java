package factory.abstractfactory;

import factory.Computer;
import factory.MacbookComputer;

public class AppleFactory implements ProductionFactory {
    public Computer createComputer() {
        return new MacbookComputer();
    }
    public OperatingSystem createSystem() {
        return new MacSystem();
    }
}
