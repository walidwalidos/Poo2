import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Personne[] personnes = {
            new Personne("aaa", "aaa", 25, 2),
            new Personne("ccc", "fff", 19, 3),
            new Personne("bbb", "fff", 20, 1),
            new Personne("zzz", "yyy", 22, 4)
        };

        System.out.println("Tab originale :");
        for (Personne p : personnes) {
            p.afficher();
        }

        // class interne anonymous with the ordonnerNomPrenom class

        Personne.ordonnerNomPrenom sorter = new Personne.ordonnerNomPrenom();

        Arrays.sort(personnes, new Comparator<Personne>() {
            public int compare(Personne p1, Personne p2) {
                return sorter.compare(p1, p2);
            }
        });

        System.out.println("\nAprès tri par Nom puis Prénom :");
        for (Personne p : personnes) {
            p.afficher();
        }
    }
}
