package factory.abstractfactory;

import factory.Computer;

public class Client {
    public void buy(Computer c){
        System.out.println("I buy a computer");
        c.printComputer();
    }

    public void use(OperatingSystem s) {
        System.out.println("Operating System");
        s.printSystem();
    }

    public static void main(String[] args) {
        ProductionFactory pf = new AppleFactory();
        Computer c = pf.createComputer();
        OperatingSystem s = pf.createSystem();

        Client client = new Client();
        client.buy(c);
        client.use(s);
    }
}
