package HW2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile implements Writer {
    @Override
    public void write(String value) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\MyApps\\Hille\\FileForWriting.txt");
        fileWriter.write(value); //проработать вариант с дозаписью без стирания. Вначале открыть и считать, а затем по последнему индексу дописывать?
        fileWriter.close();
        System.out.println("Запись в файл выполнена.");
    }
}
