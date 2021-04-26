package factory.simplefactory;

import factory.Computer;

public class Client {
    public void buy(Computer c){
        System.out.println("I buy a computer");
        c.printComputer();
    }

    public static void main(String[] args) {
        Client c = new Client();
        ComputerFactory cf = new ComputerFactory();

        Computer computer = cf.createComputer("macbook");
        c.buy(computer);
    }
}
