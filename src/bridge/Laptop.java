package bridge;

public class Laptop extends Computer {
    public Laptop(Brand brand, Color color) {
        super(brand, color);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is a laptop");
    }
}
