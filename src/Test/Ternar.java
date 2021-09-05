package Test;

public class Ternar {
    private static String word;
    private static int some = 5;

    public static void main(String[] args) {
        word = (some == 4) ? "Hello" : "World";
        System.out.println(word);
        some = 4;
        word = (some == 4) ? "Hello" : "World";
        System.out.println(word);
    }
}
