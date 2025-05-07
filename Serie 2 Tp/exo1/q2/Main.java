public class Main{
    public static void main(String ... args){
        Adresse a = new Adresse("b1","blida");
        Personne p1 = new Personne("walid",19,a);
        System.out.println(p1);
        try{
          Personne p2 = (Personne)p1.clone();
          System.out.println(p2);
          p2.setNome("ahmed ");
          p2.setage(20);
          p2.setAdress("b3","alger");
         System.out.println("after clone p2: "+p2);
         System.out.println("after clone p1: "+p1);
        }catch(CloneNotSupportedException e){
              System.out.println(e);       
        }
        
    }
}