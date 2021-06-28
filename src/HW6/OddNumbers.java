package HW6;

public class OddNumbers {
    public static int[][] oddNumberArrayCreation(int size) {
        int[][] array = new int[size][size];
        int number = 1;
        int moveString = 0;
        int firstNumber = size / 2;
        int moveColumn = 0;
        for (int i = 0; i < 3; i += moveString) {
            for (int j = firstNumber; j < 3; j += moveColumn) {
                if (array[i][j] == 0) {
                    array[i][j] = number;
                    number++;
                    if (i >= 1)
                        moveString = -1;
                    else
                        moveString = size - 1;
                    if (j < (size -1))
                        moveColumn = moveColumn + 1;
                    else
                        moveColumn = moveColumn - (size - 1);
                } else {
                    array[i + 1][j] = number;
                    number++;
                }
                System.out.println( i + " " + j + " - " + array[i][j]);
            }
        }

        return null;
    }
}
