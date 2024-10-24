package CodePatronBuilder.Cours;

public class Client {
    public static void main(String[] args) {
        MonteurPizzaPiquante monteurPizzaPiquante = new MonteurPizzaPiquante();

        MonteurPizzaReine monteurPizzaReine = new MonteurPizzaReine();

        /* Le client demande au directeur de lui créer une pizza piquante */
        Directeur directeurP = new Directeur(monteurPizzaPiquante);

        /* initialisation à la construction de la pizza piquante */
        directeurP.construire();


        /* Le client demande au directeur de lui créer une pizza reine */
        Directeur directeurR = new Directeur(monteurPizzaReine);

        /* initialisation à la construction de la pizza reine */
        directeurR.construire();
    }
}
