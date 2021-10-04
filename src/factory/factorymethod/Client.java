package factory.factorymethod;

import factory.Computer;

public class Client {
    public static void main(String[] args) {
        ComputerFactory cf = new AppleFactory();
        Computer computer = cf.createComputer();
        computer.printComputer();
    }
}
