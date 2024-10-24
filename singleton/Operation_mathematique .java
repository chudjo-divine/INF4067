package CodeSingleton.Devoir;

public class Operation_Mathematique{
    private static Operation_mathematique instance = null;
    private int x;
    private int y;

    private String nom = "Math";

    /* object constructor */
    private operaton_mathematique() {
        super();
    }

    /* other constructor */
    private Operation_mathematique (int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }
    public static Operation_mathematique getInstance() {
        if(instance == null) {
            instance =  new Operation_mathematique ();
        }
        return instance;
    }

    /* second retuning object */
    public static Operation_mathematique getInstance(int x, int y, String nom) {
        if(instance == null) {
            instance =  new Operation_mathematique (x,y,nom);
        }
        return instance;
    }

    /* other methods */
    public int somme(int x, int y) {
        return x + y;
    }

    public float mutiplication(int x, int y) {return x * y;}

    public int soustraction(int x, int y) {return x - y;}

    public int division(int x, int y) {return x / y;}

    public float moyenne(int x, int y) {
        return (float) (somme(x, y) / 2);
    }

    public void affiche() {
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " y =  " + this.y + " et nom = " + this.nom);
    }
}
