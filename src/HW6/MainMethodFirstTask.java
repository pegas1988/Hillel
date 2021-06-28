package HW6;

public class MainMethodFirstTask {
    public static void main(String[] args) {
     //FirstTaskLogic.workWithArray();
        int[][] array = new int [3][3];
        array = OddNumbers.oddNumberArrayCreation(3);
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
