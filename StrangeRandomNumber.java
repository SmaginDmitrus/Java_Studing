import java.util.stream.IntStream;

public class StrangeRandomNumber {
    private static int mid(int value) {
        return value / 10 % 1000;
    }

    public static IntStream pseudoRandomStream(int seed) {

        return IntStream.iterate(seed, x -> mid(x * x)); // your implementation here
    }

    public static void main(String[] args) {
        (pseudoRandomStream(13)).limit(10).forEach(System.out::println);
    }
}
