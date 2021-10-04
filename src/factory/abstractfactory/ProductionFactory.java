package factory.abstractfactory;

import factory.Computer;

public interface ProductionFactory {
    Computer createComputer();
    OperatingSystem createSystem();
}
