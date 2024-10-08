package animal;

public class Canin extends Mammifere {

    private String race;
    private String utilite;
    private int age;

    public Canin() {
    }

    public Canin(String race, String utilite, int age) {
        this.race = race;
        this.utilite = utilite;
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getUtilite() {
        return utilite;
    }

    public void setUtilite(String utilite) {
        this.utilite = utilite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void pousseUnCri() {
        System.out.println("I'm a Canin and I'm so cute");
    }
}
