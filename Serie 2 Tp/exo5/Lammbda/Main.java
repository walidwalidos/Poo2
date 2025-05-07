import java.util.Arrays;
// يمكن عدم كتابة import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Personne[] personnes = {
            new Personne("aaa", "aaa", 25, 2),
            new Personne("ccc", "fff", 19, 3),
            new Personne("bbb", "fff", 20, 1),
            new Personne("zzz", "yyy", 22, 4)
        };

        System.out.println("Before Sorting :");
        for (Personne p : personnes) {
            p.afficher();
        }

        // Lambda Expression with the ordonnerNomPrenom class

        Personne.ordonnerNomPrenom sorter = new Personne.ordonnerNomPrenom();

        Arrays.sort(personnes,(p1,p2)->sorter.compare(p1, p2));

        System.out.println("\nAftet Sorting :");
        for (Personne p : personnes) {
            p.afficher();
        }
    }
}
