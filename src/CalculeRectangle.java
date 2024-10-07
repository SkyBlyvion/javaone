// on importe la classe Scanner pour notre test
import java.util.Scanner;

// on crée une classe nommée CalculeRectangle
public class CalculeRectangle {

    // on crée une methode nommée main car c'est la methode principale
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quelle est la longueur ?");
        int Longeur = sc.nextInt();

        System.out.println("Quelle est la largeur ?");
        int Largeur = sc.nextInt();

        System.out.println("La surface est " + Longeur * Largeur);

        // Compiler : docker exec -it javaone javac CalculeRectangle.java
        // Lancer : docker exec -it javaone java CalculeRectangle
    }
}
