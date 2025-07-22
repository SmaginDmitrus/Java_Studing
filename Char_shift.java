public class Char_shift {
    public static char shift(int a){
        int b = '\\' + a;
        return (char) b;
    }
    public static void main(String[] args) {
        System.out.println(shift(32));
    }
}
