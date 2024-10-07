package animal;

public class Mammifere {

    private int nbrPatte;
    private String regimeAlimentaire;
    private int moisGestation;
    private boolean estSolitaire;

    public int getNbrPatte() {
        return nbrPatte;
    }

    public void setNbrPatte(int nbrPatte) {
        this.nbrPatte = nbrPatte;
    }

    public String getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    public int getMoisGestation() {
        return moisGestation;
    }

    public void setMoisGestation(int moisGestation) {
        this.moisGestation = moisGestation;
    }

    public boolean isEstSolitaire() {
        return estSolitaire;
    }

    public void setEstSolitaire(boolean estSolitaire) {
        this.estSolitaire = estSolitaire;
    }

    public void pousseUnCri(){
        System.out.println("Le mammifère pousse un cri !!");
    }
}
