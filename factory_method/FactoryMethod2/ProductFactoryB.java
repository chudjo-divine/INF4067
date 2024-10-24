package CodeFM.Devoir.FactoryMethod2;

public class ProductFactoryB extends ProductFactory {
    @Override
    public Product createProductP2() {
        return new ProductB();
    }
}
