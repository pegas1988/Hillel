package HW6;

import java.util.Scanner;

public class CreateArraySecondTask {

    static int number = 0;

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        return number;
    }

    public static int[][] createNewArray() {
        getNumber();
        int[][] array = null;
        int count = 1;
        if (number == 4) {
            System.out.println("Will be created 4x4 magic box");
            array = new int[number][number];
            for (int e = 0; e < 4; e++) {
                for (int i = 0; i < 4; i++) {
                    array[e][i] = count;
                    count++;
                }
            }
        } else if (number == 3) {
            System.out.println("Will be created 3x3 magic box");
            array = new int[number][number];
            for (int e = 0; e < 3; e++) {
                for (int i = 0; i < 3; i++) {
                    array[e][i] = count;
                    count++;
                }
            }
        }
        return array;
    }

    public static int greatM(int m) {
        int greatM = (m * (m * m + 1)) / 2;
        return greatM;
    }

    public static void showArray(int[][] array) {
        if (number == 3) {
            for (int i = 0; i < 3; i++) {
                for (int e = 0; e < 3; e++) {
                    System.out.print(array[i][e] + " ");
                }
                System.out.println();
            }
        } else if (number == 4) {
            for (int i = 0; i < 4; i++) {
                for (int e = 0; e < 4; e++) {
                    System.out.print(array[i][e] + " ");
                }
                System.out.println();
            }
        }
    }
}
