public class SqrtExp  {
    public static void main(String[] args) {
        System.out.println(sqrt(-10));
    }
    public static double sqrt(double x) throws IllegalArgumentException{
        if (x<0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }else{
            return Math.sqrt(x);
        }

    }
    
}
