import java.util.Scanner;
import java.util.*;


public class Main{
  public static void main(String ...args){

   Scanner sc = new Scanner(System.in);
   System.out.println("give me a number");
   int a =sc.nextInt();
   System.out.println("give me a nother number");
   int b =sc.nextInt();
   sc.nextLine(); 

   System.out.println("give me an opearation");
   String mop =sc.nextLine().toUpperCase();
   try{
   MATHENUM mathenum = MATHENUM.valueOf(mop);
   System.out.println(MATHENUM.operate(mathenum.getMO(),a,b));
   }
   catch(IllegalArgumentException e){
    System.out.println(e);
   }


    }
}