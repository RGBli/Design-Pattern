package bridge;

public class Desktop extends Computer {
    public Desktop(Brand brand, Color color) {
        super(brand, color);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is a desktop");
    }
}
