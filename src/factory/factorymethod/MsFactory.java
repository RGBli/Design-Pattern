package factory.factorymethod;

import factory.Computer;
import factory.SurfaceBookComputer;

public class MsFactory implements ComputerFactory {
    public Computer createComputer(){
        return new SurfaceBookComputer();
    }
}
