public class Main {
    public static void main(String ...args) {
        
        double addresult = MathCalcule.calculer(1, 2,(a,b)->a + b);

        double minresult = MathCalcule.calculer(1, 2,(a,b)->a - b);

        double mulresult = MathCalcule.calculer(1, 2,(a,b)->a * b);


        double divresult = MathCalcule.calculer(8, 2,(a, b)-> {
                if (b == 0) {
                    throw new ArithmeticException("Division par zéro");
                }
                return a / b;
                });


        System.out.println("Somme: " + addresult);
        System.out.println("Différence: " + minresult);
        System.out.println("Produit: " + mulresult);
        System.out.println("Quotient: " + divresult);
    }
}
