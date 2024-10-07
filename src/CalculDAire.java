import polygone.Cercle;
import polygone.Rectangle;
import polygone.Triangle;

public class CalculDAire {

    public static void main(String[] args) {

        // Rectangle
        Rectangle rectangle1 = new Rectangle(5, 7.5f);
        rectangle1.rectangleArea();

        // Triangle
        Triangle triangle1 = new Triangle(5, 7.5f);
        triangle1.airTriangle();

        // Cercle
        Cercle cercle1 = new Cercle(5, 3.14);
        cercle1.cercleArea();




    }
}
