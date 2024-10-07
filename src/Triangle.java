public class Triangle {
    // propriete du triangle
    private float hauteur;
    private float base;

    public Triangle() {
    }

    public Triangle(float hauteur, float base) {
        this.hauteur = hauteur;
        this.base = base;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    // methode du calcul de l'area
    public void airTriangle(){
        System.out.println("l'aire du triangle est de : " + (this.base * this.hauteur) / 2);
    }
}

