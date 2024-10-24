package CodeFM.Devoir.FactoryMethod2;

public class ProductFactoryC extends ProductFactory{
    @Override
    public Product createProductP2() {
        return new ProductC();
    }
}
