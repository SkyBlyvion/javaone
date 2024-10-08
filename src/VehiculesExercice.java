import vehicules.Voiture;
import vehicules.Moto;

public class VehiculesExercice {

    public static void main(String[] args) {

        Voiture voiture = new Voiture("Tesla", "Model S", "Électrique", 4);
        voiture.demarrer();
        voiture.afficherInfo();
        voiture.arreter();

        System.out.println();

        Moto moto = new Moto("Harley-Davidson", "Sportster", "Essence", false);
        moto.demarrer();
        moto.afficherInfo();
        moto.arreter();

        System.out.println();

        Moto moto1 = new Moto("Yamaha", "YBR", "Essence", true);
        moto1.demarrer();
        moto1.afficherInfo();
        moto1.arreter();
    }
}