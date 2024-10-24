package CodeAbstractFactory.Devoir;

public class ProductFactory1 implements IProductFactory {
    @Override
    public ProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB getProductB() {
        return new ProductB1();
    }

    @Override
    public ProductC getProductC() {
        return new ProductC1();
    }
}
