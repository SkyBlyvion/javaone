import animal.Canin;
import animal.Felin;

public class LaVieDesMammifere {

    public static void main(String[] args) {

        Canin canigou = new Canin("Berger", "garde les moutons", 8);
        canigou.setEstSolitaire(false);
        canigou.setNbrPatte(4);
        canigou.setRegimeAlimentaire("carnivore");
        canigou.pousseUnCri();

        Felin felix = new Felin("BobCat", 2, "humains");
        felix.setNbrPatte(3);

        System.out.println(canigou.getRace());
        System.out.println(canigou.getNbrPatte());

        System.out.println(felix);
        felix.pousseUnCri();
    }
}
