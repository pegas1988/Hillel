package Test;

public class AnotherArray {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        for (int i = 0;  i < array.length; i ++) {
            System.out.println(array[i]);
            array[i] += 5;
        }
        System.out.println();
        for (int i : array) {
            System.out.println(i);
        }
    }
}
