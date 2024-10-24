package CodePatronBuilder;

public class Directeur {
    MonteurPizza monteurPizza = null;

    /* Si le choix est une pizza piquante */
    public Directeur(MonteurPizzaPiquante monteurPizzaPiquante) {
        this.monteurPizza = monteurPizzaPiquante;
    }

    /* Si le choix est une pizza reine */
    public Directeur(MonteurPizzaReine monteurPizzaReine) {
        this.monteurPizza = monteurPizzaReine;
    }

    /* Construction de la pizza */
    public void construire() {
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterGarniture();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.getPizza().print();
    }
}
