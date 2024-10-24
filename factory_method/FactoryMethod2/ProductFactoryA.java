package CodeFM.Devoir.FactoryMethod2;

public class ProductFactoryA extends ProductFactory {
    @Override
    public Product createProductP2() {
        return new ProductA();
    }
}
