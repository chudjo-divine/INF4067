package CodeFM.Devoir.FactoryMethod;

public class ProduitC extends Produit {

    @Override
    public void methodeD() {
        System.out.println("Je suis dans le produit type C ajouté pour le devoir");
        System.out.println("Devoir.ProduitC.methodeP()");
    }
}
