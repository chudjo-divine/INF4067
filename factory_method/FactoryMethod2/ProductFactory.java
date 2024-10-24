package CodeFM.Devoir.FactoryMethod2;

public abstract class ProductFactory {
    public Product getProductP2() {
        return createProductP2();
    }

    protected abstract Product createProductP2();
}
