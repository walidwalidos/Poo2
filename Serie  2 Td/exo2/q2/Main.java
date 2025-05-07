import java.util.function.Function;


public class Main{
    public static void main(String ...args){



        Function<String,String> function  = str-> MyClass.StReverse(str);
        System.out.println(function.apply("walid"));


}
    
}