import java.math.BigInteger;

public class Factorial {
        public static BigInteger factorial(int value) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
           for(int i =0;i<value-1;i++){
        a = a.multiply(b.add(BigInteger.ONE));
        b = b.add(BigInteger.ONE);

    }
    return a; // your implementation here
}

    public static void main(String[] args) {
       int value = 6;
      System.out.println(factorial(value));
    }
}
