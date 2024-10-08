import animal.Canin;
import animal.Felin;
import animal.Mammifere;

public class LaVieDesMammifere {

    public static void main(String[] args) {

        Mammifere chat = new Felin();

        Canin canigou = new Canin("Berger", "garde les moutons", 8);
        canigou.setEstSolitaire(false);
        canigou.setNbrPatte(4);
        canigou.setRegimeAlimentaire("carnivore");
        canigou.pousseUnCri();

        Felin felix = new Felin("BobCat", 2, "humains", 4);
        felix.setNbrPatte(3);
        felix.setRegimeAlimentaire("carnivore");
        felix.setMoisGestation(9);

        System.out.println(canigou.getRace());
        System.out.println(canigou.getNbrPatte());

        System.out.println(felix);
        felix.pousseUnCri();
    }
}
