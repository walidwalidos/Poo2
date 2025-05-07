import java.util.function.Function;

public class Main{
    public static void main(String ...args){
        

        Custom  custom = MyClass::new;
        MyClass myClass = custom.reverseinter("walid");
        System.out.println(myClass.str);


}

}