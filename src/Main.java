// Classe de lancement du programme, création d'une premiere méthode
public class Main {
    // Methode principale et on ajoute un argument
    public static void main(String[] args) {

        // Declaration de variable int et affecter une valeur
        int age;
        age = 24;

        // long représente un entier
        long caEntreprise = 25600000L;

        // true ou false
        boolean isExist = true;

        // Declaration de variables char
        char leS = 'S';
        char initial = '\uf224';

        // Classes Integer, String et Boolean encapsulent les primitives
        Integer codePorte = 4586;
        String uneChaine = "Le soleil brille";
        Boolean unTest = false;
        Integer moiDansLAvenir = age + 15;

        // Affichage d'un message dans la console + concat avec l'argument
        System.out.println("New Vegas " + args[0] + "Rocks !");
        System.out.println("Vous avez " + moiDansLAvenir + " ans");
        System.out.println("La ca de l'entreprise est de " + caEntreprise);
        System.out.println("Le char est " + leS);
        System.out.println("Le char est " + initial);
        System.out.println("Le code porte est " + codePorte.equals(4586));
        System.out.println(uneChaine.toUpperCase());
        System.out.println("Le test est " + unTest);

    }
}