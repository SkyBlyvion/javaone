// on importe java.util.List pour notre test et java.util.ArrayList
// ou sinon import java.util.*
import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        // declarer un tableau d'entier int
        int[] ages = { 5, 15, 18, 22, 55 };

        // collections
        List<String> eleves = new ArrayList<String>();
        eleves.add("Nicolas");
        eleves.add("Alexandre");
        eleves.add("Bob Lennon");

        // print simple
        System.out.println("Age à l'index 2 : " + ages[2]);

        // get permet de récupérer une valeur
        System.out.println("Eleve à l'index 3 : " + eleves.get(2));

    }
}
