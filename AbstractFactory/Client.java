package CodeAbstractFactory.Devoir;

public class Client {
    public static void main(String[] args) {
        IProductFactory productFactory1 = new ProductFactory1();
        IProductFactory productFactory2 = new ProductFactory2();

        ProductA productA = null;
        ProductB productB = null;
        ProductC productC = null;

        System.out.println("Utilisation de la premiere fabrique");
        productA = productFactory1.getProductA();
        productB = productFactory1.getProductB();
        productC = productFactory1.getProductC();
        productA.methodeA();
        productB.methodeB();
        productC.methodeC();

        System.out.println("Utilisation de la seconde fabrique");
        productA = productFactory2.getProductA();
        productB = productFactory2.getProductB();
        productC = productFactory2.getProductC();
        productA.methodeA();
        productB.methodeB();
        productC.methodeC();
    }
}
