package builder.director;

public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void setPartA() {
        product.setPartA("Part A");
    }

    @Override
    public void setPartB() {
        product.setPartB("Part B");
    }

    @Override
    public void setPartC() {
        product.setPartC("Part C");
    }

    @Override
    public Product build() {
        return product;
    }
}
