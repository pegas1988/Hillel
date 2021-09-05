package Test;

public class TestLoop {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        for (int element : array) {
            System.out.println(element);
            element += 5;
        }
        System.out.println();
        for (int element : array)
            System.out.println(element);
    }
}
