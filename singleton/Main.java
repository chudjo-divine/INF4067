package CodeSingleton.Devoir;

import CodeSingleton.Cours.Singleton;

public class Main {
    public static void main(String[] args) {
        int som = Operation_mathematique.getInstance().somme(2,5);
        System.out.printf("la somme est %d",som);

        /* New instance of singleton with parameters */
       Operation_mathematique  s1 = Operation_mathematique.getInstance(8, 3, "Math2");
        s1.affiche();

        /* New instance of singleton with parameters */
        Operation_mathematique s2 = Operation_mathematique.getInstance(5, 9, "Math3");
        s2.affiche();
    }
}
