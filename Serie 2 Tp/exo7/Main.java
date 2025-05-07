import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose one day:");
        String jsc = sc.nextLine().toUpperCase(); 

        try {
            JourSemaine js = JourSemaine.valueOf(jsc);
            
            System.out.println("Choose an hour:");
            int hour = sc.nextInt();

            if (js.estOuvert(hour)) {
                System.out.println("Le magasin est ouvert.");
            } else {
                System.out.println("Le magasin est fermé.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Jour invalide : " + e.getMessage());
        }
    }
}
