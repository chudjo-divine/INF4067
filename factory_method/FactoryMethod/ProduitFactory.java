package CodeFM.Devoir.FactoryMethod;

public class ProduitFactory {
    public static final int TYPE_PRODUITA = 1;
    public static final int TYPE_PRODUITB = 2;

    public static final int TYPE_PRODUITC = 3;

    public Produit getProduitD(int typeProduit) {

        return switch (typeProduit) {
            case TYPE_PRODUITA -> new ProduitA();
            case TYPE_PRODUITB -> new ProduitB();
            case TYPE_PRODUITC -> new ProduitC();
            default -> throw new IllegalArgumentException("Type de produit inexistant");
        };
    }
}
