package vehicules;

public class VehiculeMotorise implements vehicules {

    private String marque;
    private String modele;
    private String TypeDeCarburant;

    public VehiculeMotorise(String marque, String modele, String typeDeCarburant) {
        this.marque = marque;
        this.modele = modele;
        TypeDeCarburant = typeDeCarburant;
    }

    @Override
    public void demarrer() {
        System.out.println(modele + " demarre");
    }

    @Override
    public void arreter() {
        System.out.println(modele + " s'arrete");
    }

    @Override
    public void afficherInfo() {
        StringBuffer chaine = new StringBuffer();
        chaine.append(marque + " ").append(modele + "").append(TypeDeCarburant + " ");
        System.out.println("affiche les infos : " + chaine.toString());
    }
}
