package CodeAbstractFactory.Devoir;

public class ProductFactory2 implements IProductFactory {
    @Override
    public ProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB getProductB() {
        return new ProductB2();
    }

    @Override
    public ProductC getProductC() {
        return new ProductC2();
    }
}
