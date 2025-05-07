import java.util.Comparator;
public class Personne implements Cloneable {
    private String nom;
    private String prenom;
    private int age;
    private int id;


    public Personne(String nom, String prenom, int age, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.id = id;
    }


    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age + ", ID: " + id);
    }


    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }
    public int getId() { return id; }


    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setAge(int age) { this.age = age; }
    public void setId(int id) { this.id = id; }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    public static class ordonnerNomPrenom implements Comparator<Personne> {
    public int compare(Personne p1, Personne p2) {
        int c = p1.getNom().compareTo(p2.getNom());
        return (c == 0) ? p1.getPrenom().compareTo(p2.getPrenom()) : c;
    }
    }



}

