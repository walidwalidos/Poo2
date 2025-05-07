public class Main {
    public static void main(String... args) {
        Carte[] cartes1 = {
            Carte.NEUF,
            Carte.AS,
            Carte.DIX
        };
        
        Carte[] cartes2 = {
            Carte.AS,
            Carte.NEUF,
            Carte.DIX
        };

        for (int i = 0; i < cartes1.length; i++) {
            System.out.println(Carte.meilleureCarte(cartes1[i], cartes2[i]).name());
        }
        System.out.println(cartes1.length);
    }
}
