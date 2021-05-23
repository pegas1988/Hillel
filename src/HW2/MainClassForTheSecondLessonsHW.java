package HW2;

import java.io.IOException;
import java.util.Scanner;

public class MainClassForTheSecondLessonsHW {
    public static void main(String[] args) throws IOException {

        WriterToConsole consoleWriter = new WriterToConsole();
        WriteToFile writeToFile = new WriteToFile();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пожалуйста первой строкой предложеие, а второй строкой ключевое слово.");
        String sentenceFromUser = scanner.nextLine();
        String wordFromUser = scanner.nextLine();

        System.out.println("Выберите вариант вывода информации после обработки данных: " + "\n" +
                "1 - выод в консоль" + "\n" +
                "2 - вывод в файл");
        int theKeyForWriting = scanner.nextInt();
        while (theKeyForWriting <= 0 || theKeyForWriting > 2) {
            System.out.println("Вы ввели некорректный номер варианта, пожалуйста выберите 1 или 2!");
            theKeyForWriting = scanner.nextInt();
        }

        System.out.println("Выберите действие, которрое вы хотите совершить с введенными данными:" + "\n" +
                "1 - для определения индекса первой встречи ключевого слова" + "\n" +
                "2 - для поиска колличества совпадений" + "\n" +
                "3 - для вычесления длины строки после исключения всех совпадений с ключевым словом");

        int theKeyForActions = scanner.nextInt();
        while (theKeyForActions <= 0 || theKeyForActions > 3) {
            System.out.println("Вы ввели некорректный номер варианта, пожалуйста выберите 1, 2 или 3!");
            theKeyForActions = scanner.nextInt();
        }


        switch (theKeyForActions) {
            case 1:
                IndexOfTheWord entityForIndex = new IndexOfTheWord();
                if (theKeyForWriting == 1) {
                    System.out.print("Первый раз ключевое слово встречается по индексу: ");
                    consoleWriter.write(Integer.toString(entityForIndex.execute(sentenceFromUser, wordFromUser)));
                } else {
                    writeToFile.write("Первый раз ключевое слово встречается по индексу: " + entityForIndex.execute(sentenceFromUser, wordFromUser));
                }
                break;
            case 2:
                CounterOfRepeating counter = new CounterOfRepeating();
                if (theKeyForWriting == 1) {
                    System.out.print("Колличество совпадений: ");
                    consoleWriter.write(Integer.toString(counter.execute(sentenceFromUser, wordFromUser)));
                } else {
                    writeToFile.write("Колличество совпадений: " + counter.execute(sentenceFromUser, wordFromUser));
                }
                break;
            case 3:
                SentenceWthoutWord sentenceWthoutWord = new SentenceWthoutWord();
                if (theKeyForWriting == 1) {
                    System.out.print("Длина строки: ");
                    consoleWriter.write(sentenceWthoutWord.execute(sentenceFromUser, wordFromUser) + " символа.");
                } else {
                    writeToFile.write("Длина строки: " + sentenceWthoutWord.execute(sentenceFromUser, wordFromUser) + " символа.");

                }
                break;
        }


    }
}
