package CodeFM.Devoir.FactoryMethod;

public class ProduitA extends Produit {
    @Override
    public void methodeD() {
        System.out.println("Je suis dans le produit de type A");
        System.out.println("Devoir.ProduitA.methodeP()");
    }
}
