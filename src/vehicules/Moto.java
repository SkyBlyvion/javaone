package vehicules;

public class Moto extends VehiculeMotorise {

    private boolean EstAvecSideCar;
    static int nbreRoue = 2;

    public Moto(String marque, String modele, String typeDeCarburant, boolean EstAvecSideCar) {
        super(marque, modele, typeDeCarburant);
        this.EstAvecSideCar = EstAvecSideCar;
        if(EstAvecSideCar){
            nbreRoue = 3;
        }
    }

    public boolean isEstAvecSideCar() {
        return EstAvecSideCar;
    }

    public void setEstAvecSideCar(boolean estAvecSideCar) {
        EstAvecSideCar = estAvecSideCar;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Avec sidecar: " + ((EstAvecSideCar) ? "Oui" : "Non"));
    }
}
