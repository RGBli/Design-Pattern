package flyweight;

public class UnsharedConcreteFlyWeight {
    private String info;

    UnsharedConcreteFlyWeight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
