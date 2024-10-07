public class Rectangle {
    private float longueur;
    private float largeur;

    public Rectangle() {
    }

    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public void rectangleArea(){
        System.out.println("l'aire du rectangle est de : " + (this.longueur * this.largeur));
    }
}
