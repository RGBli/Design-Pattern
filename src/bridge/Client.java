package bridge;

public class Client {
    public static void main(String[] args) {
        Computer whiteIMac = new Desktop(new Apple(), new White());
        whiteIMac.printInfo();

        Computer blackDellInspiration = new Laptop(new Dell(), new Black());
        blackDellInspiration.printInfo();
    }
}
