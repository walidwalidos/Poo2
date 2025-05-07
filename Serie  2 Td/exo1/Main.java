
//         question 1
//          (x)->x*x;


//             question 2 +   question 3
import java.util.function.*; 


public class Main{
    public static void main(String ...args){

       

        Predicate<Integer> predicate = (a) ->{ System.out.println(a*a);return true;} ;
        predicate.test(10);

        Consumer<Integer> consumer = (a)->System.out.println(a*a);
        consumer.accept(10);

        Function<Integer,Integer> square = (a)->a*a;
        System.out.println(square.apply(10)); 

        BiPredicate<Integer,Integer> bipredicate = (a,b) ->{ System.out.println(a*a);return true;} ;
        bipredicate.test(10,10);

        BiConsumer<Integer,Integer> biconsumer = (a,b)->System.out.println(a*a);
        biconsumer.accept(10,10);

        BiFunction<Integer,Integer,Integer> bisquare = (a,b)->a*a;
        System.out.println(bisquare.apply(10,20)); 
        
        UnaryOperator<Integer> unaryOperator = a -> a*a;
        System.out.println(unaryOperator.apply(10));

        BinaryOperator<Integer> binaryOperator = (a,b)->a*a;
        System.out.println(binaryOperator.apply(10,10));

        IntConsumer intConsumer = a->System.out.println(a*a);
        intConsumer.accept(10);

        IntPredicate intPredicate = a -> {System.out.println(a*a);return true;};
        intPredicate.test(10);

        IntUnaryOperator intUnaryOperator = (a) -> a*a;
        System.out.println(intUnaryOperator.applyAsInt(10));

        IntBinaryOperator intBinaryOperator = (a,b)->a*a;
        System.out.println(intBinaryOperator.applyAsInt(10,10));

        ToIntFunction<Integer> toIntFunction = a -> a*a;
        System.out.println(toIntFunction.applyAsInt(10));
 
        ToIntBiFunction<Integer,Integer> toIntBiFunction = (a,b)->a*a;
        System.out.println(toIntBiFunction.applyAsInt(10,10));

    }
}