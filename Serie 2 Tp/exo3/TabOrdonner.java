import java.util.Arrays;

public class TabOrdonner{
    public static class Ordonneur{
        public static void ordonner(int[] tab){
            Arrays.sort(tab);
        }
        public static void afficher(int[] tab){
            System.out.println(Arrays.toString(tab));
        }
    }
}