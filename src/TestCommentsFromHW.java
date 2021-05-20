import java.util.Random;

public class TestCommentsFromHW {
    public static void main(String[] args) {
        Random someName = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(someName.nextInt(50));
        }
    }
}
