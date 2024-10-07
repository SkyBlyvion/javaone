package animal;

public class Felin extends Mammifere {

    private String nom;
    private int nbrDeVie;
    private String regime;

    public Felin() {}

    public Felin(String nom, int nbrDeVie, String regime) {
        this.nom = nom;
        this.nbrDeVie = nbrDeVie;
        this.regime = regime;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrDeVie() {
        return nbrDeVie;
    }

    public void setNbrDeVie(int nbrDeVie) {
        this.nbrDeVie = nbrDeVie;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    @Override
    public String toString() {
        return "Felin{" +
                "nom='" + nom + '\'' +
                ", nbrDeVie=" + nbrDeVie +
                ", regime='" + regime + '\'' +
                ", nbrPatte=" + getNbrPatte() +
                ", regimeAlimentaire='" + getRegimeAlimentaire() + '\'' +
                ", moisGestation=" + getMoisGestation() +
                '}';
    }

    @Override
    public void pousseUnCri() {
        System.out.println("c'était un cri FORT!!");
    }
}
