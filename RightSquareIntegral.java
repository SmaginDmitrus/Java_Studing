import java.util.function.DoubleUnaryOperator;

public class RightSquareIntegral {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        final double step = 1e-6;
        double sum = 0;
        while (Math.abs(a - b) > step) {
            sum += f.applyAsDouble(a) * step;
            a += step;
            
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println(integrate(x -> 1, 0, 10));

    }
}
