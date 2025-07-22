import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMax {
   
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> result = stream.collect(Collectors.toList());
        if (result.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            result.sort(order);
            minMaxConsumer.accept(result.get(0), result.get(result.size() - 1));
        }
    };

    

    public static void main(String[] args) {

    }
}

