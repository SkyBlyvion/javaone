package vehicules;

public class Voiture extends VehiculeMotorise {

    private int nombreDePortes;
    static final int nbreRoue = 4;

    public Voiture(String marque, String modele, String typeDeCarburant, int nombreDePortes) {
        super(marque, modele, typeDeCarburant);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Nombre de portes : " + nombreDePortes);
    }

    public int getNombreDePortes() {
        return nombreDePortes;
    }

    public void setNombreDePortes(int nombreDePortes) {
        this.nombreDePortes = nombreDePortes;
    }
}
