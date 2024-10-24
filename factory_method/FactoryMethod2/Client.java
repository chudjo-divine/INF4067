package CodeFM.Devoir.FactoryMethod2;


public class Client {
    public static void main(String[] args) {
        ProductFactoryA productFactoryA = new ProductFactoryA();
        ProductFactoryB productFactoryB = new ProductFactoryB();
        ProductFactoryC productFactoryC = new ProductFactoryC();

        Product product = null;

        product = productFactoryA.getProductP2();
        product.methodeP2();

        product = productFactoryB.getProductP2();
        product.methodeP2();

        product = productFactoryC.getProductP2();
        product.methodeP2();

    }
}
