import heroes.Ennemie;
import heroes.Mage;
import heroes.Knight;

public class DonjonEtDragon {

    public static void main(String[] args) {

        // Création d'un Mage (héros)
        Mage mage = new Mage();
        System.out.println("Le mage entre en combat :");
        mage.criDeGuerre();
        mage.combat();

        // Création d'un Ennemi (par exemple un Orc)
        Ennemie orc = new Ennemie();
        System.out.println("\nUn ennemi" + " apparaît !");
        orc.criDeGuerre();
        orc.combat();
    }
}
