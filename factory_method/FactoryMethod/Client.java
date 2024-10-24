package CodeFM.Devoir.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();

        Produit produit = null;

        produit = produitFactory.getProduitD(ProduitFactory.TYPE_PRODUITA);
        produit.methodeD();

        produit = produitFactory.getProduitD(ProduitFactory.TYPE_PRODUITB);
        produit.methodeD();

        produit = produitFactory.getProduitD(ProduitFactory.TYPE_PRODUITC);
        produit.methodeD();
    }
}