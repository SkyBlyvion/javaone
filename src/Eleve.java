public class Eleve {

    // Voici notre premier objet
    private String nom;
    private String prenom;
    private String section;
    private int age;

    // Constructeur vide
    public Eleve() {
    }

    // Constructeur avec nos propriétées
    public Eleve(String nom, String prenom, String section, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.section = section;
        this.age = age;
    }

    public Eleve(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Clic droit GENERER > Getter & Setter
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRegistered() {
        if(this.section != null) {
            return true;
        } else {
            return false;
        }

        // return (this.section != null) ? true : false;
    }

    public void howOldAreYou(int majorite) {
        if(this.age != 0) {
            System.out.println("You are " + this.age + " years old");
            if(age > majorite)
                System.out.println("YOU'RE TOO OLD TO BE IN SCHOOL");
        } else {
            System.out.println("INFINITY YEARS OLD");
        }
    }

}
