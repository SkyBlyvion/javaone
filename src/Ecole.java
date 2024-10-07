
import java.util.ArrayList;
import java.util.List;

public class Ecole {
    public static void main(String[] args) {

        // Collection List
        List<Eleve> listEleve = new ArrayList<Eleve>();

        Eleve eleve1 = new Eleve();
        Eleve eleve2 = new Eleve("The Sting", "Man", "CFA CDA", 20);
        Eleve eleve3 = new Eleve("Bazar", "Dimanche", "CFA CDA", 15);

//        eleve1.setNom("Nicolas");
//        eleve1.setPrenom("Lopez");
//        eleve1.setAge(18);
//        eleve1.setSection("CFA CDA");

        listEleve.add(eleve1);
        listEleve.add(eleve2);
        listEleve.add(eleve3);

        for(Eleve eleve : listEleve) {
            System.out.println("l'inconnu est " + eleve.getNom());
            System.out.println("il est inscrit : " + eleve.isRegistered());
            eleve.howOldAreYou(18);
        }
    }


}
