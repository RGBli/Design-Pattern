package factory.simplefactory;

import factory.Computer;

public class Client {
    public static void main(String[] args) {
        ComputerFactory cf = new ComputerFactory();
        Computer computer = cf.createComputer("Macbook");
        computer.printComputer();
    }
}
