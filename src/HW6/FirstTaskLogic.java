package HW6;

import java.util.Random;

public class FirstTaskLogic {
    static int counter = 0;
    static int[] array = new int[15];

    public static int randomGenerator() {
        Random rnd = new Random();
        return Math.abs(rnd.nextInt(225) + 14) / 15;
    }

    public static int ifAvailable(int number) throws MyExceptionFirstTask {
        for (int e = 0; e < 10; e++) {
            while (number < 15) {
                if (array[number] == 0) {
                    System.out.println("place " + number);
                    return number;
                }
                else number = number + 3;
            }
            number = number - 15 + counter;
            counter ++;
        }
        return 20;
    }


    public static void workWithArray() {
        int tempNumber;
        try {
            for (int e = 0; e < 15; e++) {
                tempNumber = randomGenerator();
                System.out.println("number " + tempNumber);
                array[ifAvailable(tempNumber)] = tempNumber;
                counter = 0;
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Произошло зацикливание");
            throw new MyExceptionFirstTask();
        }
    }
}
