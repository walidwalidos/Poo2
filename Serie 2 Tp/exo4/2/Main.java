public class Main {
    public static void main(String ...args) {
        
        double addresult = MathCalcule.calculer(1, 2, new Operation() {
            public double execute(double a, double b) {
                return a + b;
            }
        });

        double minresult = MathCalcule.calculer(1, 2, new Operation() {
            public double execute(double a, double b) {
                return a - b;
            }
        });

        double mulresult = MathCalcule.calculer(1, 2, new Operation() {
            public double execute(double a, double b) {
                return a * b;
            }
        });

        double divresult = MathCalcule.calculer(8, 2, new Operation() {
            public double execute(double a, double b) {
                if (b == 0) {
                    throw new ArithmeticException("Division par zéro");
                }
                return a / b;
            }
        });


        System.out.println("Somme: " + addresult);
        System.out.println("Différence: " + minresult);
        System.out.println("Produit: " + mulresult);
        System.out.println("Quotient: " + divresult);
    }
}
