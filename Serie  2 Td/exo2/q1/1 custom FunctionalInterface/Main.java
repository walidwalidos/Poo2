public class Main{
    public static void main(String ...args){

        
        Custom C1 = new Custom(){
            public String reverseinter (String str){
               return MyClass.StReverse(str);
            }
        };
        System.out.println(C1.reverseinter("walid"));



    }
}