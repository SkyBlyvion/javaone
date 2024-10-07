package polygone;

public class Cercle {

    private float diametre;
    private double pi = Math.PI;


    public Cercle() {

    }

    public Cercle(float diametre, double pi) {
        this.diametre = diametre;
        this.pi = pi;

    }
    public float getdiametre() {
        return diametre;
    }

    public void setdiametre(float diametre) {
        this.diametre = diametre;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }


    // methode du calcul de l'area
    public void cercleArea(){
        System.out.println("l'aire du cercle est de : " + (this.pi * Math.pow(this.diametre / 2 , 2  )));
    }
}

