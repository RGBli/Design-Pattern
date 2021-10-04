package builder.director;

public interface Builder {
    public void setPartA();

    public void setPartB();

    public void setPartC();

    public Product build();
}
