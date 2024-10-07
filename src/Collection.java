// on importe java.util.List pour notre test et java.util.ArrayList
// ou sinon import java.util.*

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // declarer un tableau d'entier int
        int[] ages = { 5, 15, 18, 22, 55 };

        boolean estPlusGrand = 18 > 25;

        // collection LIST
        List<String> eleves = new ArrayList<String>();
        eleves.add("Nicolas");
        eleves.add("Alexandre");
        eleves.add("Bob Lennon");

        // collection SET
        Set<String> villes = new HashSet<>();
        villes.add("Perpignan");
        villes.add("Nyon");
        villes.add("Le Soler");
        villes.add("Perpignan");

        // collection MAP
        Map<String, String> capsules = new HashMap<>();
        capsules.put("capsules étoiles", "New Vegas");
        capsules.put("capsules sun", "Sunaris");
        capsules.put("capsules moon", "Fallout 4");
        capsules.put("capsules Earth", "Earth");



        // boucle for avec keyset concatene clé et valeurs
        for(String argent : capsules.keySet()) {
            System.out.println("La " + argent + " est une capsule de " + capsules.get(argent));
        }

        // iterator permet de parcourir une collection
        Iterator iterator = villes.iterator();
        while (iterator.hasNext()) {
            System.out.println("Voici la ville : " + iterator.next());
        }

        // print simple
        System.out.println("Age à l'index 2 : " + ages[2]);

        // get permet de récupérer une valeur
        System.out.println("Eleve à l'index 3 : " + eleves.get(2));

    }
}
