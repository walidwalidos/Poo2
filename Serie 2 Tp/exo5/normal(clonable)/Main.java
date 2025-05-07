import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Personne personne1 = new Personne("Doe", "John", 30, 1);
            Personne personneClone = (Personne) personne1.clone(); 


            personneClone.setNom("Smith");
            personneClone.setPrenom("Jane");
            personneClone.setAge(25);
            personneClone.setId(2);

            System.out.println("Personne originale:");
            personne1.afficher();

            System.out.println("Personne clonée:");
            personneClone.afficher();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
