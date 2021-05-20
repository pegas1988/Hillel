public class TaskTwo {
    public static void main(String[] args) {
        int array[] = new int[10];
        double summ = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + (int) (Math.random() * 11);
            summ = summ + array[i];
        }
        System.out.println(summ / 10);
    }
}
