package factory.abstractfactory;

import factory.Computer;

public interface ProductionFactory {
    public Computer createComputer();
    public OperatingSystem createSystem();

}
