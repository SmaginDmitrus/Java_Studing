import java.util.Objects;


public class Pair<T,X> {
    private final T value1;
    private final X value2;
    private Pair(T value1,X value2){
        this.value1 = value1;
        this.value2 = value2;
    } 
    public T getFirst(){
        return this.value1;
    }
    public X getSecond(){
        return this.value2;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        };

        if (obj instanceof Pair<?,?> other){
                return((Objects.equals(value1, other.value1))&&( Objects.equals(value2, other.value2)));
        }else{return false;}
    }
    public int hashCode() {
        return Objects.hashCode(value1)+Objects.hashCode(value2);
    }
    public static <T,X> Pair<T,X> of(T value1,X value2){
        return new Pair<>(value1,value2);
    }
}
