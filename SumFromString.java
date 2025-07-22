import java.io.InputStreamReader;
import java.util.Scanner;

public class SumFromString {

    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        while (scanner.hasNext() != false) {
            if (scanner.hasNextDouble() == true) {
                sum += scanner.nextDouble();
            }else{
                scanner.next();
            }
        }
        scanner.close();

        System.out.printf("%6f", sum);

    }
}
