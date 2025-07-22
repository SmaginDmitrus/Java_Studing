import java.util.function.*;

public class Notebook{
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
    Function<T,U> resultingFunction = x -> condition.test(x) ?  ifTrue.apply(x):  ifFalse.apply(x);
        

    
        return resultingFunction; // your implementation here
    
    }

    public static void main(String[] args) {

    }
}
