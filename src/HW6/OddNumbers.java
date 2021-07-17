package HW6;

public class OddNumbers {
    public static int[][] oddNumberArrayCreation(int size) {
        int[][] array = new int[size][size];
        int number = 1;
        int strings = 0;
        int columns = size / 2;
        while (true) {
            if (array[strings][columns] == 0) {
                array[strings][columns] = number;
//                System.out.println(strings + " " + columns);
//                System.out.println(array[strings][columns]);
                number++;
                if (number == size*size + 1) {
                    break;
                }
                strings = strings - 1;
                if (strings < 0) {
                    strings = size - 1;
                    columns++;
                    if (columns <= size - 1)
                        columns = columns;
                    else
                        columns = 0;
                } else {
                    strings = strings;
                    columns++;
                    if (columns <= size - 1)
                        columns = columns;
                    else
                        columns = 0;
                }

            } else {
                if (strings == size - 1) {
                    //strings = 0;
                    strings = 1;
                    columns = size - 1;
                    //columns = columns;
                }
                else if (columns == 0 && strings == 0) {
                    strings = strings + 2;
                    columns = size - 1;
                }
                else {
                    strings = strings + 2;
                    columns = columns - 1;
                }
                array[strings][columns] = number;
//                System.out.println(strings + " " + columns);
//                System.out.println(array[strings][columns]);
                number++;
                if (number == size*size + 1) {
                    break;
                }
                strings = strings - 1;
                if (strings < 0) {
                    strings = size - 1;
                    columns++;
                    if (columns <= size - 1)
                        columns = columns;
                    else
                        columns = 0;
                } else {
                    strings = strings;
                    columns++;
                    if (columns <= size - 1)
                        columns = columns;
                    else
                        columns = 0;
                }

            }

        }
        return array;
    }
}
