
import java.util.ArrayList;
import java.util.List;

public class Ecole {
    public static void main(String[] args) {

        // Collection List
        List<Eleve> listEleve = new ArrayList<Eleve>();

        Eleve eleve1 = new Eleve();

        eleve1.setNom("Nicolas");
        eleve1.setPrenom("Lopez");
        eleve1.setAge(18);
        eleve1.setSection("CFA CDA");

        listEleve.add(eleve1);

        for(Eleve eleve : listEleve) {
            System.out.println("l'inconnu est " + eleve.getNom().toUpperCase());
        }
    }
}
