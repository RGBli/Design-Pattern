package factory.factorymethod;

import factory.Computer;
import factory.MacbookComputer;

public class AppleFactory implements ComputerFactory {
    public Computer createComputer() {
        return new MacbookComputer();
    }
}
