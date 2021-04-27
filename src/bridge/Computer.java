package bridge;

public class Computer {
    protected Brand brand;

    protected Color color;

    public Computer(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public void printInfo() {
        brand.printBrand();
        color.printColor();
    }
}
