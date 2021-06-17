package factory.abstractfactory;

import factory.Computer;

public class Client {
    public static void main(String[] args) {
        ProductionFactory pf = new AppleFactory();
        Computer c = pf.createComputer();
        OperatingSystem s = pf.createSystem();
        c.printComputer();
        s.printSystem();
    }
}
