package factory.abstractfactory;

import factory.Computer;
import factory.SurfaceBookComputer;

public class MsFactory implements ProductionFactory {
    public Computer createComputer() {
        return new SurfaceBookComputer();
    }
    public OperatingSystem createSystem() {
        return new WindowsSystem();
    }
}
