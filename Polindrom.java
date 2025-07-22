public class Polindrom {

    public static boolean isPalindrom(String text) {
       text = text.replaceAll("[^a-zA-Z0-9]", "") ;
        StringBuilder b = new StringBuilder();
        b.append(text);
        b = b.reverse();
        String c = b.toString();
        return c.equalsIgnoreCase(text);
    }

    public static void main(String[] args) {
        String text = "Madam, I'm Adam!";
        System.out.println(isPalindrom(text));
    }
}
